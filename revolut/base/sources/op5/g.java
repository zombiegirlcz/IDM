package op5;

import com.revolut.feature.crypto.withdraw.impl.ui.recipientdetails.SubmitRecipientDetailsActionHandler$FinalAction;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f227525a;

    static {
        int[] iArr = new int[SubmitRecipientDetailsActionHandler$FinalAction.values().length];
        try {
            iArr[SubmitRecipientDetailsActionHandler$FinalAction.GO_BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubmitRecipientDetailsActionHandler$FinalAction.DO_NOTHING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f227525a = iArr;
    }
}
