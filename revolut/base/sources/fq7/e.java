package fq7;

import com.revolut.feature.insurance_car.impl.data.model.Contact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Contact f137202a;

    public e(Contact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f137202a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f137202a, ((e) obj2).f137202a);
    }

    public final int hashCode() {
        return this.f137202a.hashCode();
    }
}
