package o55;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f222343a = new h();

    private h() {
    }

    @Override // xx4.c
    public final TypeToken e() {
        TypeToken typeToken = TypeToken.get(Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        return typeToken;
    }

    @Override // ne0.a
    public final /* bridge */ /* synthetic */ String getKey() {
        return "LoanListRequestedKey";
    }
}
