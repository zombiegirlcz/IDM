package xe;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import ye.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304503a;

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        switch (this.f304503a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj2.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj2;
                ve.d dVar = (ve.d) obj3;
                dVar.add(g.f312731g, entry.getKey());
                dVar.add(g.f312732h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj2.getClass().getCanonicalName());
        }
    }
}
