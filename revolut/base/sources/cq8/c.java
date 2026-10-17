package cq8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f108023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f108024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f108025c;

    public c(Data taskData, Data coparentsData, Data userData) {
        Intrinsics.checkNotNullParameter(taskData, "taskData");
        Intrinsics.checkNotNullParameter(coparentsData, "coparentsData");
        Intrinsics.checkNotNullParameter(userData, "userData");
        this.f108023a = taskData;
        this.f108024b = coparentsData;
        this.f108025c = userData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f108023a, cVar.f108023a) && Intrinsics.f(this.f108024b, cVar.f108024b) && Intrinsics.f(this.f108025c, cVar.f108025c);
    }

    public final int hashCode() {
        return this.f108025c.hashCode() + kii.e.c(this.f108024b, this.f108023a.hashCode() * 31, 31);
    }
}
