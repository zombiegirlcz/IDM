package fkj;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f135849a;

    public e(Data esimPhoneNumberPortOutCredentials) {
        Intrinsics.checkNotNullParameter(esimPhoneNumberPortOutCredentials, "esimPhoneNumberPortOutCredentials");
        this.f135849a = esimPhoneNumberPortOutCredentials;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f135849a, ((e) obj2).f135849a);
    }

    public final int hashCode() {
        return this.f135849a.hashCode();
    }
}
