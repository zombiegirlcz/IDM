package zp0;

import android.text.Editable;
import kotlin.text.Regex;
import kotlin.text.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f324157a = new Regex("\\d{1,2}:?\\d{0,2}");

    public static int a(Editable editable, int i) {
        Character chR0;
        Integer numB;
        if (editable == null || (chR0 = f0.R0(i, editable)) == null || (numB = kotlin.text.a.b(chR0.charValue())) == null) {
            return -1;
        }
        return numB.intValue();
    }
}
