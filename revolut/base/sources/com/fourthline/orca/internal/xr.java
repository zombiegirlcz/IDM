package com.fourthline.orca.internal;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface xr {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f35079a;

        public a(List accessRights) {
            Intrinsics.checkNotNullParameter(accessRights, "accessRights");
            this.f35079a = accessRights;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f35079a, ((a) obj2).f35079a);
        }

        public int hashCode() {
            return this.f35079a.hashCode();
        }

        public String toString() {
            return "Input(accessRights=" + this.f35079a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
