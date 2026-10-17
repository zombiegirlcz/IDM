package com.revolut.feature.payments.splitbill.impl.ui_new.link_context;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.contacts_chooser.api.context.ContextAction;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/link_context/SplitBillLinkAction;", "Lcom/revolut/feature/contacts_chooser/api/context/ContextAction;", "", "", "tag", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SHOW_QR", "COPY", "SHARE", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitBillLinkAction implements ContextAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SplitBillLinkAction[] $VALUES;
    public static final SplitBillLinkAction COPY;

    @NotNull
    public static final Parcelable.Creator<SplitBillLinkAction> CREATOR;
    public static final SplitBillLinkAction SHARE;
    public static final SplitBillLinkAction SHOW_QR;

    @NotNull
    private final String tag;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return SplitBillLinkAction.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillLinkAction[i];
        }
    }

    static {
        SplitBillLinkAction splitBillLinkAction = new SplitBillLinkAction("SHOW_QR", 0, "SPLIT_BILL_QR_WIDGET_QR_BUTTON_TAG");
        SHOW_QR = splitBillLinkAction;
        SplitBillLinkAction splitBillLinkAction2 = new SplitBillLinkAction("COPY", 1, "SPLIT_BILL_QR_WIDGET_COPY_LINK_BUTTON_TAG");
        COPY = splitBillLinkAction2;
        SplitBillLinkAction splitBillLinkAction3 = new SplitBillLinkAction("SHARE", 2, "SPLIT_BILL_QR_WIDGET_SHARE_BUTTON_TAG");
        SHARE = splitBillLinkAction3;
        SplitBillLinkAction[] splitBillLinkActionArr = {splitBillLinkAction, splitBillLinkAction2, splitBillLinkAction3};
        $VALUES = splitBillLinkActionArr;
        $ENTRIES = s.n(splitBillLinkActionArr);
        CREATOR = new a();
    }

    public SplitBillLinkAction(String str, int i, String str2) {
        this.tag = str2;
    }

    public static SplitBillLinkAction valueOf(String str) {
        return (SplitBillLinkAction) Enum.valueOf(SplitBillLinkAction.class, str);
    }

    public static SplitBillLinkAction[] values() {
        return (SplitBillLinkAction[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
