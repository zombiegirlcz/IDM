package com.fourthline.vision.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface b7 {

    public interface a extends b7 {

        /* JADX INFO: renamed from: com.fourthline.vision.internal.b7$a$a, reason: collision with other inner class name */
        public static final class C0329a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f36003a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0329a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ C0329a copy$default(C0329a c0329a, String str, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = c0329a.f36003a;
                }
                return c0329a.copy(str);
            }

            @NotNull
            public final String component1() {
                return this.f36003a;
            }

            @NotNull
            public final C0329a copy(@NotNull String modelName) {
                Intrinsics.checkNotNullParameter(modelName, "modelName");
                return new C0329a(modelName);
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0329a) && Intrinsics.f(this.f36003a, ((C0329a) obj2).f36003a);
            }

            @Override // com.fourthline.vision.internal.b7.a, com.fourthline.vision.internal.b7
            @NotNull
            public String getModelName() {
                return this.f36003a;
            }

            public int hashCode() {
                return this.f36003a.hashCode();
            }

            @NotNull
            public String toString() {
                return "LITE(modelName=" + this.f36003a + ")";
            }

            public C0329a(@NotNull String modelName) {
                Intrinsics.checkNotNullParameter(modelName, "modelName");
                this.f36003a = modelName;
            }

            public /* synthetic */ C0329a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "hand_landmark_lite.tflite" : str);
            }
        }

        @Override // com.fourthline.vision.internal.b7
        @NotNull
        /* synthetic */ String getModelName();
    }

    @NotNull
    String getModelName();
}
