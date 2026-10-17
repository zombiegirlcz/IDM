package br4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f17911a;

    public m(Data detailsModel) {
        Intrinsics.checkNotNullParameter(detailsModel, "detailsModel");
        this.f17911a = detailsModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f17911a, ((m) obj2).f17911a);
    }

    public final int hashCode() {
        return this.f17911a.hashCode();
    }
}
