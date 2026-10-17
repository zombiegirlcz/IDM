package tim;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Ltim/d;", "Ltim/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends c implements Serializable {

    @NotNull
    private static final a Companion = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f271590c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f271591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f271592h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltim/d$a;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public d(int i, int i2) {
        int i3 = ~i;
        this.f271590c = i;
        this.d = i2;
        this.e = 0;
        this.f = 0;
        this.f271591g = i3;
        this.f271592h = (i << 10) ^ (i2 >>> 4);
        if ((i | i2 | i3) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i5 = 0; i5 < 64; i5++) {
            c();
        }
    }

    @Override // tim.c
    public final int a(int i) {
        return czi.c.K(c(), i);
    }

    @Override // tim.c
    public final int c() {
        int i = this.f271590c;
        int i2 = i ^ (i >>> 2);
        this.f271590c = this.d;
        this.d = this.e;
        this.e = this.f;
        int i3 = this.f271591g;
        this.f = i3;
        int i5 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f271591g = i5;
        int i6 = this.f271592h + 362437;
        this.f271592h = i6;
        return i5 + i6;
    }
}
