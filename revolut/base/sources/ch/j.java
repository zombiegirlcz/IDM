package ch;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class j {

    @NonNull
    @KeepForSdk
    public static final j BASE;

    @NonNull
    @KeepForSdk
    public static final j CUSTOM;

    @NonNull
    @KeepForSdk
    public static final j DIGITAL_INK;

    @NonNull
    @KeepForSdk
    public static final j DIGITAL_INK_SEGMENTATION;

    @NonNull
    @KeepForSdk
    public static final j ENTITY_EXTRACTION;

    @NonNull
    @KeepForSdk
    public static final j IMAGE_CAPTIONING;

    @NonNull
    @KeepForSdk
    public static final j TOXICITY_DETECTION;

    @NonNull
    @KeepForSdk
    public static final j TRANSLATE;

    @NonNull
    @KeepForSdk
    public static final j UNKNOWN;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final /* synthetic */ j[] f24029zza;

    static {
        j jVar = new j("UNKNOWN", 0);
        UNKNOWN = jVar;
        j jVar2 = new j("BASE", 1);
        BASE = jVar2;
        j jVar3 = new j("TRANSLATE", 2);
        TRANSLATE = jVar3;
        j jVar4 = new j("ENTITY_EXTRACTION", 3);
        ENTITY_EXTRACTION = jVar4;
        j jVar5 = new j("CUSTOM", 4);
        CUSTOM = jVar5;
        j jVar6 = new j("DIGITAL_INK", 5);
        DIGITAL_INK = jVar6;
        j jVar7 = new j("DIGITAL_INK_SEGMENTATION", 6);
        DIGITAL_INK_SEGMENTATION = jVar7;
        j jVar8 = new j("TOXICITY_DETECTION", 7);
        TOXICITY_DETECTION = jVar8;
        j jVar9 = new j("IMAGE_CAPTIONING", 8);
        IMAGE_CAPTIONING = jVar9;
        f24029zza = new j[]{jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9};
    }

    @NonNull
    public static j[] values() {
        return (j[]) f24029zza.clone();
    }
}
