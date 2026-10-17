package com.fourthline.vision.internal;

import android.graphics.PointF;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fa f36317a;

    public static final class a extends h6 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final fa f36318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f36319c;
        private final List d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull fa faceBox, boolean z, @NotNull List<? extends PointF> contours) {
            super(faceBox, null);
            Intrinsics.checkNotNullParameter(faceBox, "faceBox");
            Intrinsics.checkNotNullParameter(contours, "contours");
            this.f36318b = faceBox;
            this.f36319c = z;
            this.d = contours;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a copy$default(a aVar, fa faVar, boolean z, List list, int i, Object obj2) {
            if ((i & 1) != 0) {
                faVar = aVar.f36318b;
            }
            if ((i & 2) != 0) {
                z = aVar.f36319c;
            }
            if ((i & 4) != 0) {
                list = aVar.d;
            }
            return aVar.copy(faVar, z, list);
        }

        @NotNull
        public final fa component1() {
            return this.f36318b;
        }

        public final boolean component2() {
            return this.f36319c;
        }

        @NotNull
        public final List<PointF> component3() {
            return this.d;
        }

        @NotNull
        public final a copy(@NotNull fa faceBox, boolean z, @NotNull List<? extends PointF> contours) {
            Intrinsics.checkNotNullParameter(faceBox, "faceBox");
            Intrinsics.checkNotNullParameter(contours, "contours");
            return new a(faceBox, z, contours);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f36318b, aVar.f36318b) && this.f36319c == aVar.f36319c && Intrinsics.f(this.d, aVar.d);
        }

        @NotNull
        public final List<PointF> getContours() {
            return this.d;
        }

        public final boolean getEyesOpen() {
            return this.f36319c;
        }

        @Override // com.fourthline.vision.internal.h6
        @NotNull
        public fa getFaceBox() {
            return this.f36318b;
        }

        public int hashCode() {
            return (((this.f36318b.hashCode() * 31) + Boolean.hashCode(this.f36319c)) * 31) + this.d.hashCode();
        }

        @NotNull
        public String toString() {
            return "Accurate(faceBox=" + this.f36318b + ", eyesOpen=" + this.f36319c + ", contours=" + this.d + ")";
        }
    }

    public static final class b extends h6 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final fa f36320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f36321c;
        private final float d;
        private final float e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull fa faceBox, boolean z, float f, float f4) {
            super(faceBox, null);
            Intrinsics.checkNotNullParameter(faceBox, "faceBox");
            this.f36320b = faceBox;
            this.f36321c = z;
            this.d = f;
            this.e = f4;
        }

        public static /* synthetic */ b copy$default(b bVar, fa faVar, boolean z, float f, float f4, int i, Object obj2) {
            if ((i & 1) != 0) {
                faVar = bVar.f36320b;
            }
            if ((i & 2) != 0) {
                z = bVar.f36321c;
            }
            if ((i & 4) != 0) {
                f = bVar.d;
            }
            if ((i & 8) != 0) {
                f4 = bVar.e;
            }
            return bVar.copy(faVar, z, f, f4);
        }

        @NotNull
        public final fa component1() {
            return this.f36320b;
        }

        public final boolean component2() {
            return this.f36321c;
        }

        public final float component3() {
            return this.d;
        }

        public final float component4() {
            return this.e;
        }

        @NotNull
        public final b copy(@NotNull fa faceBox, boolean z, float f, float f4) {
            Intrinsics.checkNotNullParameter(faceBox, "faceBox");
            return new b(faceBox, z, f, f4);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f36320b, bVar.f36320b) && this.f36321c == bVar.f36321c && Float.compare(this.d, bVar.d) == 0 && Float.compare(this.e, bVar.e) == 0;
        }

        public final boolean getEyesOpen() {
            return this.f36321c;
        }

        @Override // com.fourthline.vision.internal.h6
        @NotNull
        public fa getFaceBox() {
            return this.f36320b;
        }

        public final float getPitch() {
            return this.e;
        }

        public final float getYaw() {
            return this.d;
        }

        public int hashCode() {
            return (((((this.f36320b.hashCode() * 31) + Boolean.hashCode(this.f36321c)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e);
        }

        @NotNull
        public String toString() {
            return "Fast(faceBox=" + this.f36320b + ", eyesOpen=" + this.f36321c + ", yaw=" + this.d + ", pitch=" + this.e + ")";
        }
    }

    public /* synthetic */ h6(fa faVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(faVar);
    }

    @NotNull
    public fa getFaceBox() {
        return this.f36317a;
    }

    private h6(fa faVar) {
        this.f36317a = faVar;
    }
}
