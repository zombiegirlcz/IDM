package com.fourthline.vision.selfie;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/fourthline/vision/selfie/LivenessCheckType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "HEAD_TURN", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LivenessCheckType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ LivenessCheckType[] f37206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37207b;
    public static final LivenessCheckType NONE = new LivenessCheckType("NONE", 0);
    public static final LivenessCheckType HEAD_TURN = new LivenessCheckType("HEAD_TURN", 1);

    private static final /* synthetic */ LivenessCheckType[] $values() {
        return new LivenessCheckType[]{NONE, HEAD_TURN};
    }

    static {
        LivenessCheckType[] livenessCheckTypeArr$values = $values();
        f37206a = livenessCheckTypeArr$values;
        f37207b = s.n(livenessCheckTypeArr$values);
    }

    private LivenessCheckType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f37207b;
    }

    public static LivenessCheckType valueOf(String str) {
        return (LivenessCheckType) Enum.valueOf(LivenessCheckType.class, str);
    }

    public static LivenessCheckType[] values() {
        return (LivenessCheckType[]) f37206a.clone();
    }
}
