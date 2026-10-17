package tld;

import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272050a;

    static {
        int[] iArr = new int[SlotDefaultPrompt.LayoutType.values().length];
        try {
            iArr[SlotDefaultPrompt.LayoutType.HERO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlotDefaultPrompt.LayoutType.THREE_D.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlotDefaultPrompt.LayoutType.IN_APP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SlotDefaultPrompt.LayoutType.STORY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SlotDefaultPrompt.LayoutType.MODAL_STORY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f272050a = iArr;
    }
}
