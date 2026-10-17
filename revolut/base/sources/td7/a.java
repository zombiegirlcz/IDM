package td7;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import kotlin.jvm.internal.Intrinsics;
import rd7.h;
import rd7.j;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableIntObjectMap f269936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f269937b;

    public a(j galleryInput) {
        Intrinsics.checkNotNullParameter(galleryInput, "galleryInput");
        MutableIntObjectMap mutableIntObjectMapMutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        int i = 0;
        for (Object obj2 : galleryInput.f253369a) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            String strA = ((h) obj2).a();
            if (strA != null) {
                mutableIntObjectMapMutableIntObjectMapOf.put(i, strA);
            }
            i = i2;
        }
        this.f269936a = mutableIntObjectMapMutableIntObjectMapOf;
    }
}
