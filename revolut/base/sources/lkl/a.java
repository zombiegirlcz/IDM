package lkl;

import java.nio.charset.Charset;
import java.util.List;
import kg.o;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f196477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl0.a f196478b;

    public a(o gson, tl0.a base64Wrapper) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f196477a = gson;
        this.f196478b = base64Wrapper;
    }

    public final Pair a(String str) {
        List listN0 = d0.n0(str, new String[]{"."}, 0, 6);
        if (listN0.size() <= 1) {
            return null;
        }
        String str2 = (String) listN0.get(0);
        tl0.a aVar = this.f196478b;
        byte[] bArrF = aVar.f(str2);
        Charset charset = Charsets.UTF_8;
        return new Pair(new String(bArrF, charset), new String(aVar.f((String) listN0.get(1)), charset));
    }
}
