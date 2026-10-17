package com.google.firebase.messaging;

import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49556c;

    public x(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            String str3 = "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".";
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(p.a.p("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f49554a = strSubstring;
        this.f49555b = str;
        this.f49556c = com.google.android.gms.internal.mlkit_vision_face.a.o(str, "!", str2);
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f49554a.equals(xVar.f49554a) && this.f49555b.equals(xVar.f49555b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f49555b, this.f49554a);
    }
}
