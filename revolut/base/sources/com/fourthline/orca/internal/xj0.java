package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import com.fourthline.orca.internal.z;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes23.dex */
public interface xj0 {
    private default boolean j() {
        String strN = n();
        if (strN != null) {
            return z.a.f35469a.a(strN);
        }
        return true;
    }

    private default Date k() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    private default boolean p() {
        String strO = o();
        if (strO != null) {
            return z.a.f35469a.a(strO);
        }
        return false;
    }

    String a();

    default boolean b() {
        return l() && m() && p() && h() && g() && j();
    }

    String c();

    Date d();

    Gender f();

    default boolean g() {
        return f() != null;
    }

    default boolean h() {
        Date dateD = d();
        if (dateD != null) {
            return dateD.before(k());
        }
        return false;
    }

    String i();

    default boolean l() {
        if (a() != null) {
            return !kotlin.text.d0.W(r0);
        }
        return false;
    }

    default boolean m() {
        if (c() != null) {
            return !kotlin.text.d0.W(r0);
        }
        return false;
    }

    String n();

    String o();

    String q();
}
