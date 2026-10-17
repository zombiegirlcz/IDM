package dn3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f116211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f116212c;

    public b(String requestId, ArrayList selectedContacts, boolean z) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
        this.f116210a = requestId;
        this.f116211b = selectedContacts;
        this.f116212c = z;
    }

    @Override // dn3.d
    public final String a() {
        return this.f116210a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f116210a, bVar.f116210a) && this.f116211b.equals(bVar.f116211b) && this.f116212c == bVar.f116212c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116212c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f116211b, this.f116210a.hashCode() * 31, 31);
    }
}
