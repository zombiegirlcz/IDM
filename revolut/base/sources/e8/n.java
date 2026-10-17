package e8;

import android.util.Log;
import androidx.core.util.Pools$Pool;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f123502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f123503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8.a f123504c;
    public final Pools$Pool d;
    public final String e;

    public n(Class cls, Class cls2, Class cls3, List list, q8.a aVar, Pools$Pool pools$Pool) {
        this.f123502a = cls;
        this.f123503b = list;
        this.f123504c = aVar;
        this.d = pools$Pool;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final e0 a(com.bumptech.glide.load.data.g gVar, int i, int i2, c8.k kVar, List list) throws GlideException {
        List list2 = this.f123503b;
        int size = list2.size();
        e0 e0VarB = null;
        for (int i3 = 0; i3 < size; i3++) {
            c8.m mVar = (c8.m) list2.get(i3);
            try {
                if (mVar.a(gVar.a(), kVar)) {
                    e0VarB = mVar.b(gVar.a(), i, i2, kVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    String str = "Failed to decode data for " + mVar;
                }
                list.add(e);
            }
            if (e0VarB != null) {
                break;
            }
        }
        if (e0VarB != null) {
            return e0VarB;
        }
        throw new GlideException(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f123502a + ", decoders=" + this.f123503b + ", transcoder=" + this.f123504c + CoreConstants.CURLY_RIGHT;
    }
}
