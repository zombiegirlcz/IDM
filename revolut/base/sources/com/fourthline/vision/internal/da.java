package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final da f36106a = new da();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f36107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f36108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f36109c;
        private final Long d;

        public a(int i, int i2, @NotNull b startTrigger, Long l2) {
            Intrinsics.checkNotNullParameter(startTrigger, "startTrigger");
            this.f36107a = i;
            this.f36108b = i2;
            this.f36109c = startTrigger;
            this.d = l2;
        }

        public static /* synthetic */ a copy$default(a aVar, int i, int i2, b bVar, Long l2, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                i = aVar.f36107a;
            }
            if ((i3 & 2) != 0) {
                i2 = aVar.f36108b;
            }
            if ((i3 & 4) != 0) {
                bVar = aVar.f36109c;
            }
            if ((i3 & 8) != 0) {
                l2 = aVar.d;
            }
            return aVar.copy(i, i2, bVar, l2);
        }

        public final int component1() {
            return this.f36107a;
        }

        public final int component2() {
            return this.f36108b;
        }

        @NotNull
        public final b component3() {
            return this.f36109c;
        }

        public final Long component4() {
            return this.d;
        }

        @NotNull
        public final a copy(int i, int i2, @NotNull b startTrigger, Long l2) {
            Intrinsics.checkNotNullParameter(startTrigger, "startTrigger");
            return new a(i, i2, startTrigger, l2);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.f36107a == aVar.f36107a && this.f36108b == aVar.f36108b && this.f36109c == aVar.f36109c && Intrinsics.f(this.d, aVar.d);
        }

        public final int getStartRecordingStepIndex() {
            return this.f36108b;
        }

        @NotNull
        public final b getStartTrigger() {
            return this.f36109c;
        }

        public final Long getStopAfterSeconds() {
            return this.d;
        }

        public final int getTotalSteps() {
            return this.f36107a;
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.f36107a) * 31) + Integer.hashCode(this.f36108b)) * 31) + this.f36109c.hashCode()) * 31;
            Long l2 = this.d;
            return iHashCode + (l2 == null ? 0 : l2.hashCode());
        }

        public final boolean requiresRecordingOnStartStep(int i) {
            return this.f36109c == b.f36110a && this.f36108b == i;
        }

        public final boolean requiresRecordingOnTakePhoto(int i) {
            return this.f36109c == b.f36111b && this.f36108b == i;
        }

        @NotNull
        public String toString() {
            return "RecordingPlan(totalSteps=" + this.f36107a + ", startRecordingStepIndex=" + this.f36108b + ", startTrigger=" + this.f36109c + ", stopAfterSeconds=" + this.d + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f36110a = new b("StartOfStep", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f36111b = new b("TakePhotoClicked", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f36112c = new b("RecordDisabled", 2);
        private static final /* synthetic */ b[] d;
        private static final /* synthetic */ EnumEntries e;

        private static final /* synthetic */ b[] $values() {
            return new b[]{f36110a, f36111b, f36112c};
        }

        static {
            b[] bVarArr$values = $values();
            d = bVarArr$values;
            e = vc.s.n(bVarArr$values);
        }

        private b(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return e;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private da() {
    }

    private final int decidePaperIdStepsCount(boolean z) {
        return z ? 6 : 3;
    }

    public static /* synthetic */ a getRecordingPlan$default(da daVar, DocumentType documentType, boolean z, boolean z3, Long l2, int i, Object obj2) {
        if ((i & 8) != 0) {
            l2 = null;
        }
        return daVar.getRecordingPlan(documentType, z, z3, l2);
    }

    @NotNull
    public final a getRecordingPlan(@NotNull DocumentType documentType, boolean z, boolean z3, Long l2) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        if (z3) {
            return new a(z ? 4 : 2, 0, z ? b.f36110a : b.f36111b, l2);
        }
        switch (c.$EnumSwitchMapping$0[documentType.ordinal()]) {
            case 1:
                return z ? new a(2, 0, b.f36111b, l2) : new a(1, 0, b.f36110a, l2);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return z ? new a(4, 1, b.f36111b, l2) : new a(2, 0, b.f36111b, l2);
            case 7:
                return new a(decidePaperIdStepsCount(z), 0, b.f36111b, l2);
            case 8:
            case 9:
                return new a(1, -1, b.f36112c, 0L);
            default:
                throw new IllegalArgumentException("Unsupported or undefined document type: " + documentType);
        }
    }
}
