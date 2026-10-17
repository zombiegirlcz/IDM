package en0;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f127706c;
    public final String d;

    public /* synthetic */ c(int i, Long l2, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            j1.f(a.f127703a.getDescriptor(), i, 3);
            throw null;
        }
        this.f127704a = str;
        this.f127705b = str2;
        if ((i & 4) == 0) {
            this.f127706c = null;
        } else {
            this.f127706c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final Long a() {
        return this.f127706c;
    }

    public final String b() {
        return this.f127704a;
    }

    public final String c() {
        return this.f127705b;
    }

    public final String d() {
        return this.d;
    }

    public c(String id10, Long l2, String rawValue, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        this.f127704a = id10;
        this.f127705b = rawValue;
        this.f127706c = l2;
        this.d = str;
    }
}
