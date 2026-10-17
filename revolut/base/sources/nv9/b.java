package nv9;

import dv9.g;
import dv9.h;
import dv9.t;
import gv9.k;
import iv9.l;
import iv9.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f219567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jv9.b f219568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iv9.k f219569c;

    public b(k reactionsDao, jv9.b conversationToApiMapper, iv9.k chatMessageMapper) {
        Intrinsics.checkNotNullParameter(reactionsDao, "reactionsDao");
        Intrinsics.checkNotNullParameter(conversationToApiMapper, "conversationToApiMapper");
        Intrinsics.checkNotNullParameter(chatMessageMapper, "chatMessageMapper");
        this.f219567a = reactionsDao;
        this.f219568b = conversationToApiMapper;
        this.f219569c = chatMessageMapper;
    }

    public static h a(m mVar) {
        t tVar;
        String str = mVar.f168796a;
        String str2 = mVar.f168797b;
        String str3 = mVar.f168798c;
        t[] tVarArrValues = t.values();
        int length = tVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                tVar = null;
                break;
            }
            tVar = tVarArrValues[i];
            if (a0.z(tVar.name(), str3, true)) {
                break;
            }
            i++;
        }
        if (tVar == null) {
            tVar = t.UNKNOWN;
        }
        t tVar2 = tVar;
        String str4 = mVar.d;
        boolean z = mVar.e;
        List<l> list = mVar.f;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (l lVar : list) {
            arrayList.add(new g(lVar.getReaction(), lVar.getAuthorCode(), lVar.getTimestamp()));
        }
        return new h(str, str2, tVar2, str4, z, arrayList);
    }

    public static m b(h hVar) {
        String str = hVar.f118067a;
        String str2 = hVar.f118068b;
        String strName = hVar.f118069c.name();
        String str3 = hVar.d;
        boolean z = hVar.e;
        List<g> list = hVar.f;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (g gVar : list) {
            arrayList.add(new l(gVar.f118064a, gVar.f118065b, gVar.f118066c));
        }
        return new m(str, str2, arrayList, strName, str3, z);
    }
}
