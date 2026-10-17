package t70;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends r {

    @NotNull
    private static final o Companion = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f268397b = y0.b("config_inputEventCompatProcessorOverrideClassName");

    public final String a(int i) {
        try {
            String resourceEntryName = getResourceEntryName(i);
            if (f268397b.contains(resourceEntryName)) {
                resourceEntryName = this.f268398a.getString(i);
            }
            Intrinsics.h(resourceEntryName);
            return resourceEntryName;
        } catch (Throwable unused) {
            return a0.d.n("E: ", i);
        }
    }

    @Override // t70.r, android.content.res.Resources
    public final String getQuantityString(int i, int i2, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return a(i);
    }

    @Override // t70.r, android.content.res.Resources
    public final CharSequence getQuantityText(int i, int i2) {
        return a(i);
    }

    @Override // t70.r, android.content.res.Resources
    public final String getString(int i) {
        return a(i);
    }

    @Override // t70.r, android.content.res.Resources
    public final String[] getStringArray(int i) {
        String strA = a(i);
        String[] stringArray = this.f268398a.getStringArray(i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        ArrayList arrayList = new ArrayList(stringArray.length);
        int length = stringArray.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = stringArray[i2];
            arrayList.add(strA + ":" + i3);
            i2++;
            i3++;
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // t70.r, android.content.res.Resources
    public final CharSequence getText(int i) {
        return a(i);
    }

    @Override // t70.r, android.content.res.Resources
    public final String getQuantityString(int i, int i2) {
        return a(i);
    }

    @Override // t70.r, android.content.res.Resources
    public final String getString(int i, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return a(i);
    }

    @Override // t70.r, android.content.res.Resources
    public final CharSequence getText(int i, CharSequence charSequence) {
        return a(i);
    }
}
