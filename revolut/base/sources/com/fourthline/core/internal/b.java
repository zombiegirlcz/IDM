package com.fourthline.core.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26295b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26296a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(String mrzString) {
        Intrinsics.checkNotNullParameter(mrzString, "mrzString");
        this.f26296a = mrzString;
    }

    public abstract String a();

    public abstract boolean a(String str);

    public boolean b() {
        String strA = a();
        return c(strA) && b(strA) && a(strA);
    }

    public abstract boolean b(String str);

    public abstract boolean c(String str);

    public final List d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listN0 = kotlin.text.d0.n0(str, new String[]{"\n"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listN0) {
            if (((String) obj2).length() > 0) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            kotlin.text.a0.D((String) obj3, "\n", "", false);
        }
        return arrayList;
    }
}
