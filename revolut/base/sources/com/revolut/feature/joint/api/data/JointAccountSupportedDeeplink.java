package com.revolut.feature.joint.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import him.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.d0;
import zhm.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \t2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/joint/api/data/JointAccountSupportedDeeplink;", "Landroid/os/Parcelable;", "", "", "templates$1", "Ljava/lang/String;", "getTemplates", "()Ljava/lang/String;", "templates", "Companion", "a", "JOINT_INVITE", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JointAccountSupportedDeeplink implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ JointAccountSupportedDeeplink[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<JointAccountSupportedDeeplink> CREATOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final JointAccountSupportedDeeplink JOINT_INVITE;

    @NotNull
    private static final Set<String> templates;

    /* JADX INFO: renamed from: templates$1, reason: from kotlin metadata */
    @NotNull
    private final String templates = "joint-accounts/invitations/{invitationId}";

    /* JADX INFO: renamed from: com.revolut.feature.joint.api.data.JointAccountSupportedDeeplink$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return JointAccountSupportedDeeplink.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JointAccountSupportedDeeplink[i];
        }
    }

    static {
        JointAccountSupportedDeeplink jointAccountSupportedDeeplink = new JointAccountSupportedDeeplink();
        JOINT_INVITE = jointAccountSupportedDeeplink;
        JointAccountSupportedDeeplink[] jointAccountSupportedDeeplinkArr = {jointAccountSupportedDeeplink};
        $VALUES = jointAccountSupportedDeeplinkArr;
        a aVarN = s.n(jointAccountSupportedDeeplinkArr);
        $ENTRIES = aVarN;
        INSTANCE = new Companion();
        CREATOR = new b();
        ArrayList arrayList = new ArrayList(w.t(aVarN, 10));
        Iterator<E> it8 = aVarN.iterator();
        while (it8.hasNext()) {
            arrayList.add(((JointAccountSupportedDeeplink) it8.next()).templates);
        }
        templates = d0.i1(arrayList);
    }

    public static JointAccountSupportedDeeplink valueOf(String str) {
        return (JointAccountSupportedDeeplink) Enum.valueOf(JointAccountSupportedDeeplink.class, str);
    }

    public static JointAccountSupportedDeeplink[] values() {
        return (JointAccountSupportedDeeplink[]) $VALUES.clone();
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
