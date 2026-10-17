package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7 f36756a = new r7("Selfie", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r7 f36757b = new r7("HeadTurnLeft", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r7 f36758c = new r7("HeadTurnRight", 2);
    public static final r7 d = new r7("RandomnessLiveness", 3);
    private static final /* synthetic */ r7[] e;
    private static final /* synthetic */ EnumEntries f;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[r7.values().length];
            try {
                iArr[r7.f36756a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r7.f36757b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r7.f36758c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r7.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ r7[] $values() {
        return new r7[]{f36756a, f36757b, f36758c, d};
    }

    static {
        r7[] r7VarArr$values = $values();
        e = r7VarArr$values;
        f = vc.s.n(r7VarArr$values);
    }

    private r7(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f;
    }

    public static r7 valueOf(String str) {
        return (r7) Enum.valueOf(r7.class, str);
    }

    public static r7[] values() {
        return (r7[]) e.clone();
    }

    @NotNull
    public final SelfieScannerStep toPublicStep() {
        int i = a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return SelfieScannerStep.SELFIE;
        }
        if (i == 2) {
            return SelfieScannerStep.TURN_HEAD_LEFT;
        }
        if (i == 3) {
            return SelfieScannerStep.TURN_HEAD_RIGHT;
        }
        if (i == 4) {
            return bb.f36011h.getLivenessStepType();
        }
        throw new NoWhenBranchMatchedException();
    }
}
