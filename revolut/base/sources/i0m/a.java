package i0m;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pincode.common.R$string;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import yqi.f;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f157498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f157499b;

    public a(TextLocalisedClause repeatingDigitsErrorText, TextLocalisedClause consecutiveDigitsErrorText) {
        Intrinsics.checkNotNullParameter(repeatingDigitsErrorText, "repeatingDigitsErrorText");
        Intrinsics.checkNotNullParameter(consecutiveDigitsErrorText, "consecutiveDigitsErrorText");
        this.f157498a = repeatingDigitsErrorText;
        this.f157499b = consecutiveDigitsErrorText;
    }

    public static boolean a(int i, ArrayList arrayList) {
        if (arrayList.size() >= 4 && arrayList.size() >= 2) {
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 1; i3 < size; i3++) {
                if (((Number) arrayList.get(i3)).intValue() - ((Number) arrayList.get(i3 - 1)).intValue() != i) {
                    i2 = i3;
                } else if (i3 - i2 >= 3) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        hzl.d validationData = (hzl.d) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        String str = validationData.f157254a;
        ArrayList arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(Integer.valueOf(Integer.parseInt(String.valueOf(str.charAt(i)))));
        }
        if (a(0, arrayList)) {
            return new yqi.d(validationData, new hzl.f(this.f157498a, new TextLocalisedClause(R$string.revolut_passcode_creation_alert_title, null, null, 14)));
        }
        if (a(1, arrayList) || a(-1, arrayList)) {
            return new yqi.d(validationData, new hzl.f(this.f157499b, new TextLocalisedClause(R$string.revolut_passcode_creation_alert_title, null, null, 14)));
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }
}
