package com.fourthline.vision.document;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/fourthline/vision/document/MrzValidationPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "STRONG", "NORMAL", "WEAK", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MrzValidationPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ MrzValidationPolicy[] f35911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f35912b;
    public static final MrzValidationPolicy STRONG = new MrzValidationPolicy("STRONG", 0);
    public static final MrzValidationPolicy NORMAL = new MrzValidationPolicy("NORMAL", 1);
    public static final MrzValidationPolicy WEAK = new MrzValidationPolicy("WEAK", 2);

    private static final /* synthetic */ MrzValidationPolicy[] $values() {
        return new MrzValidationPolicy[]{STRONG, NORMAL, WEAK};
    }

    static {
        MrzValidationPolicy[] mrzValidationPolicyArr$values = $values();
        f35911a = mrzValidationPolicyArr$values;
        f35912b = s.n(mrzValidationPolicyArr$values);
    }

    private MrzValidationPolicy(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f35912b;
    }

    public static MrzValidationPolicy valueOf(String str) {
        return (MrzValidationPolicy) Enum.valueOf(MrzValidationPolicy.class, str);
    }

    public static MrzValidationPolicy[] values() {
        return (MrzValidationPolicy[]) f35911a.clone();
    }
}
