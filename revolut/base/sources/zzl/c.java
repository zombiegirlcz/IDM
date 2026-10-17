package zzl;

import java.util.HashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f326786a = new HashMap();

    public final boolean a(String regex, String text) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(text, "text");
        HashMap map = this.f326786a;
        Object objCompile = map.get(regex);
        if (objCompile == null) {
            objCompile = Pattern.compile(regex);
            Intrinsics.checkNotNullExpressionValue(objCompile, "compile(...)");
            map.put(regex, objCompile);
        }
        return ((Pattern) objCompile).matcher(text).matches();
    }
}
