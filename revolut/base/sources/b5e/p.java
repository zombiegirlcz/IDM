package b5e;

import com.revolut.feature.structured_note.details.impl.ui.note_details.NoteDetailsFlowControllerContract$Page;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f12507b;

    static {
        int[] iArr = new int[NoteDetailsFlowControllerContract$Page.values().length];
        try {
            iArr[NoteDetailsFlowControllerContract$Page.OVERVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f12506a = iArr;
        int[] iArr2 = new int[a.values().length];
        try {
            iArr2[a.SELL.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[a.BUY.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[a.GET_STARTED_BUY.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f12507b = iArr2;
    }
}
