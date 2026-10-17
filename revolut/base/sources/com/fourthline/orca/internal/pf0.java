package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes23.dex */
public interface pf0 {

    public interface a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pf0$a$a, reason: collision with other inner class name */
        public static final class C0263a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0263a f31952a = new C0263a();

            private C0263a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0263a);
            }

            public int hashCode() {
                return -506327304;
            }

            public String toString() {
                return "Succeed";
            }
        }
    }

    Object a(Continuation continuation);
}
