package zy1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lzy1/a;", "", "", "toString", "()Ljava/lang/String;", "Lzy1/a$a;", "a", "Lzy1/a$a;", "()Lzy1/a$a;", "attributes", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("attributes")
    @NotNull
    private final C1808a attributes;

    /* JADX INFO: renamed from: zy1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lzy1/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "redirectUrl", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1808a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("dispute_redirect_url")
        @NotNull
        private final String redirectUrl;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C1808a) && Intrinsics.f(this.redirectUrl, ((C1808a) obj2).redirectUrl);
        }

        public final int hashCode() {
            return this.redirectUrl.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C1808a getAttributes() {
        return this.attributes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.attributes, ((a) obj2).attributes);
    }

    public final int hashCode() {
        return this.attributes.hashCode();
    }
}
