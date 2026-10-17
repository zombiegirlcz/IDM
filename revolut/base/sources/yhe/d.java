package yhe;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f313914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f313915b;

    public d(Data content, String confirmationButtonTag) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(confirmationButtonTag, "confirmationButtonTag");
        this.f313914a = content;
        this.f313915b = confirmationButtonTag;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f313914a, dVar.f313914a) && Intrinsics.f(this.f313915b, dVar.f313915b);
    }

    public final int hashCode() {
        return this.f313915b.hashCode() + (this.f313914a.hashCode() * 31);
    }
}
