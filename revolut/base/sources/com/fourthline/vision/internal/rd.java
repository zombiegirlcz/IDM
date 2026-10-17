package com.fourthline.vision.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface rd {

    public interface a {

        /* JADX INFO: renamed from: com.fourthline.vision.internal.rd$a$a, reason: collision with other inner class name */
        public static final class C0336a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0336a f36817a = new C0336a();

            private C0336a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0336a);
            }

            public int hashCode() {
                return -168384285;
            }

            @NotNull
            public String toString() {
                return "Active";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f36818a = new b();

            private b() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            public int hashCode() {
                return -1421761714;
            }

            @NotNull
            public String toString() {
                return "Completed";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f36819a = new c();

            private c() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            public int hashCode() {
                return -27410918;
            }

            @NotNull
            public String toString() {
                return "Failed";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f36820a = new d();

            private d() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof d);
            }

            public int hashCode() {
                return -679265039;
            }

            @NotNull
            public String toString() {
                return "Idle";
            }
        }
    }

    fa getRecognizedBounds();

    @NotNull
    a getState();

    void moveToNextStep();

    void resetCurrentStep();

    void restart();

    void start();

    void stop();

    void takeSnapshot();
}
