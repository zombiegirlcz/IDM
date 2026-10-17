package fq9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oq9.l;
import oq9.m;
import oq9.n;
import oq9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl3.f f137217a;

    public g(dl3.f contactsMapper) {
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        this.f137217a = contactsMapper;
    }

    public static String a(o oVar) {
        String str;
        String str2;
        if (oVar instanceof l) {
            l lVar = (l) oVar;
            str = lVar.e;
            str2 = lVar.f;
        } else {
            if (!(oVar instanceof m)) {
                if (oVar instanceof n) {
                    return "";
                }
                throw new NoWhenBranchMatchedException();
            }
            m mVar = (m) oVar;
            str = mVar.e;
            str2 = mVar.f;
        }
        return com.google.android.gms.internal.mlkit_vision_face.a.o(str, " ", str2);
    }
}
