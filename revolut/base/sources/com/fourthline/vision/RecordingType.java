package com.fourthline.vision;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/fourthline/vision/RecordingType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "VIDEO_ONLY", "VIDEO_WITH_AUDIO", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecordingType {
    public static final RecordingType NONE = new RecordingType("NONE", 0);
    public static final RecordingType VIDEO_ONLY = new RecordingType("VIDEO_ONLY", 1);
    public static final RecordingType VIDEO_WITH_AUDIO = new RecordingType("VIDEO_WITH_AUDIO", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ RecordingType[] f35862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f35863b;

    private static final /* synthetic */ RecordingType[] $values() {
        return new RecordingType[]{NONE, VIDEO_ONLY, VIDEO_WITH_AUDIO};
    }

    static {
        RecordingType[] recordingTypeArr$values = $values();
        f35862a = recordingTypeArr$values;
        f35863b = s.n(recordingTypeArr$values);
    }

    private RecordingType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f35863b;
    }

    public static RecordingType valueOf(String str) {
        return (RecordingType) Enum.valueOf(RecordingType.class, str);
    }

    public static RecordingType[] values() {
        return (RecordingType[]) f35862a.clone();
    }
}
