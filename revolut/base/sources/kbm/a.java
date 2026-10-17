package kbm;

import java.time.Clock;
import java.time.ZonedDateTime;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Clock f182633c = Clock.systemDefaultZone();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f182635b = ZonedDateTime.now(f182633c);

    public a(String str) {
        this.f182634a = str;
    }
}
