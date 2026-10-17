package kw4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f190230b;

    public i(Data model, String operationId) {
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f190229a = operationId;
        this.f190230b = model;
    }

    public static i a(i iVar, Data model) {
        String operationId = iVar.f190229a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        Intrinsics.checkNotNullParameter(model, "model");
        return new i(model, operationId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f190229a, iVar.f190229a) && Intrinsics.f(this.f190230b, iVar.f190230b);
    }

    public final int hashCode() {
        return this.f190230b.hashCode() + (this.f190229a.hashCode() * 31);
    }
}
