package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import java.util.Date;

/* JADX INFO: loaded from: classes23.dex */
public interface tl0 {
    String a();

    void a(Gender gender);

    void a(String str);

    void a(Date date);

    void a(boolean z);

    void b(String str);

    boolean b();

    String c();

    Date d();

    boolean e();

    Gender f();

    int g();

    boolean h();

    boolean i();

    boolean j();

    default boolean k() {
        return d() != null;
    }

    boolean l();

    boolean m();
}
