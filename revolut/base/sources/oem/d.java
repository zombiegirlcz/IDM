package oem;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f224659b;

    public d(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f224658a = content;
        int length = content.length();
        int lowerCase = 0;
        for (int i = 0; i < length; i++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(content.charAt(i));
        }
        this.f224659b = lowerCase;
    }

    public final boolean equals(Object obj2) {
        String str;
        d dVar = obj2 instanceof d ? (d) obj2 : null;
        return (dVar == null || (str = dVar.f224658a) == null || !str.equalsIgnoreCase(this.f224658a)) ? false : true;
    }

    public final int hashCode() {
        return this.f224659b;
    }

    public final String toString() {
        return this.f224658a;
    }
}
