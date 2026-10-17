package hl7;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class w9 {

    @NotNull
    public static final v9 Companion = new v9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final no3.b f153356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153357c;
    public final String d;

    public /* synthetic */ w9(int i, String str, String str2, String str3, no3.b bVar) {
        if (15 != (i & 15)) {
            qlm.j1.f(u9.f153333a.getDescriptor(), i, 15);
            throw null;
        }
        this.f153355a = str;
        this.f153356b = bVar;
        this.f153357c = str2;
        this.d = str3;
    }
}
