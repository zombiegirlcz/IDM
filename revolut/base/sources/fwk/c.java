package fwk;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f138704a;

    public c() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f138704a, ((c) obj2).f138704a);
    }

    public final int hashCode() {
        Data data = this.f138704a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public c(Data data) {
        this.f138704a = data;
    }
}
