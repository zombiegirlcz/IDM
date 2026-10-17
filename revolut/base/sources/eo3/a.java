package eo3;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {

    /* JADX INFO: renamed from: eo3.a$a, reason: collision with other inner class name */
    public static final class C0738a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Address f127859a;

        public C0738a() {
            this(null, 3);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0738a) && Intrinsics.f(this.f127859a, ((C0738a) obj2).f127859a);
        }

        public final int hashCode() {
            Address address = this.f127859a;
            return (address == null ? 0 : address.hashCode()) * 31;
        }

        public C0738a(Address address, int i) {
            this.f127859a = (i & 1) != 0 ? null : address;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f127861b;

        public b() {
            this(null, null, CertificateBody.profileType);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f127860a, bVar.f127860a) && Intrinsics.f(this.f127861b, bVar.f127861b);
        }

        public final int hashCode() {
            String str = this.f127860a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f127861b;
            return (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 961;
        }

        public b(String str, String str2, int i) {
            str = (i & 8) != 0 ? null : str;
            str2 = (i & 16) != 0 ? null : str2;
            this.f127860a = str;
            this.f127861b = str2;
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127862a;

        public c() {
            this(null, 7);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f127862a, ((c) obj2).f127862a);
        }

        public final int hashCode() {
            String str = this.f127862a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public c(String str, int i) {
            this.f127862a = (i & 4) != 0 ? null : str;
        }
    }

    private a() {
    }
}
