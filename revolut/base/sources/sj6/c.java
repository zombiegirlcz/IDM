package sj6;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f263679a;

    public c(Data institutionInfoData) {
        Intrinsics.checkNotNullParameter(institutionInfoData, "institutionInfoData");
        this.f263679a = institutionInfoData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f263679a, ((c) obj2).f263679a);
    }

    public final int hashCode() {
        return this.f263679a.hashCode();
    }
}
