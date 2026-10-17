package mca;

import com.revolut.feature.apm.core.models.recipients.PixContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixContact f204329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f204330b;

    public a(PixContact contact, l mode) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f204329a = contact;
        this.f204330b = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f204329a, aVar.f204329a) && this.f204330b == aVar.f204330b;
    }

    public final int hashCode() {
        return this.f204330b.hashCode() + (this.f204329a.hashCode() * 31);
    }
}
