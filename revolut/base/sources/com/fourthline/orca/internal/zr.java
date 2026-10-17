package com.fourthline.orca.internal;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface zr {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35699a;

        public a(String tcTokenUrl) {
            Intrinsics.checkNotNullParameter(tcTokenUrl, "tcTokenUrl");
            this.f35699a = tcTokenUrl;
        }

        public final String a() {
            return this.f35699a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f35699a, ((a) obj2).f35699a);
        }

        public int hashCode() {
            return this.f35699a.hashCode();
        }

        public String toString() {
            return "Input(tcTokenUrl=" + this.f35699a + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f35700a;

            public a(List accessRights) {
                Intrinsics.checkNotNullParameter(accessRights, "accessRights");
                this.f35700a = accessRights;
            }

            public final List a() {
                return this.f35700a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f35700a, ((a) obj2).f35700a);
            }

            public int hashCode() {
                return this.f35700a.hashCode();
            }

            public String toString() {
                return "Success(accessRights=" + this.f35700a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
