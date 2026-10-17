package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public class ViewUtils {
    private ViewUtils() {
    }

    @KeepForSdk
    public static String getXmlAttributeString(@NonNull String str, @NonNull String str2, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z, boolean z3, @NonNull String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z) {
            String strSubstring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                StringBuilder sb6 = new StringBuilder(String.valueOf(packageName).length() + 8 + String.valueOf(strSubstring).length());
                sb6.append(packageName);
                sb6.append(":string/");
                sb6.append(strSubstring);
                resources.getValue(sb6.toString(), typedValue, true);
            } catch (Resources.NotFoundException unused) {
                j6.a.w(new StringBuilder(String.valueOf(str2).length() + 30 + attributeValue.length()), "Could not find resource for ", str2, ": ", attributeValue);
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                attributeValue = charSequence.toString();
            } else {
                String string = typedValue.toString();
                j6.a.w(new StringBuilder(String.valueOf(str2).length() + 28 + string.length()), "Resource ", str2, " was not a string: ", string);
            }
        }
        if (z3 && attributeValue == null) {
            StringBuilder sb9 = new StringBuilder(String.valueOf(str2).length() + 33);
            sb9.append("Required XML attribute \"");
            sb9.append(str2);
            sb9.append("\" missing");
            sb9.toString();
        }
        return attributeValue;
    }
}
