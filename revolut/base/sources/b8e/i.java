package b8e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f13211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f13212b;

    public i(Data model, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f13211a = model;
        this.f13212b = legalEntityContext;
    }

    public static i a(i iVar, Data model, Data legalEntityContext, int i) {
        if ((i & 1) != 0) {
            model = iVar.f13211a;
        }
        if ((i & 2) != 0) {
            legalEntityContext = iVar.f13212b;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new i(model, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f13211a, iVar.f13211a) && Intrinsics.f(this.f13212b, iVar.f13212b);
    }

    public final int hashCode() {
        return this.f13212b.hashCode() + (this.f13211a.hashCode() * 31);
    }
}
