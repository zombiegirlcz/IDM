package oi4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f225435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm3.i f225436b;

    public e() {
        this(3);
    }

    public static e a(e eVar, Data configuration, zm3.i iVar, int i) {
        if ((i & 1) != 0) {
            configuration = eVar.f225435a;
        }
        if ((i & 2) != 0) {
            iVar = eVar.f225436b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new e(configuration, iVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f225435a, eVar.f225435a) && Intrinsics.f(this.f225436b, eVar.f225436b);
    }

    public final int hashCode() {
        int iHashCode = this.f225435a.hashCode() * 31;
        zm3.i iVar = this.f225436b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public e(Data configuration, zm3.i iVar) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f225435a = configuration;
        this.f225436b = iVar;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null), null);
    }
}
