package d4a;

import hx7.q;
import jq9.k;
import jq9.m;
import jq9.n;
import jq9.o;
import jq9.p;
import jq9.r;
import jq9.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zm3.g;
import zm3.l;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f111257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4a.a f111258b;

    public b(mk0.a personalisationStorage, b4a.a pinnedRecipientDtoMapper) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(pinnedRecipientDtoMapper, "pinnedRecipientDtoMapper");
        this.f111257a = personalisationStorage;
        this.f111258b = pinnedRecipientDtoMapper;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final f4a.b a(b bVar, String str) {
        bVar.getClass();
        switch (str.hashCode()) {
            case -1825227990:
                if (str.equals("bank_account")) {
                    return f4a.b.BANK_ACCOUNT;
                }
                break;
            case -1783614153:
                if (str.equals("crypto_wallet")) {
                    return f4a.b.CRYPTO_WALLET;
                }
                break;
            case -1651301782:
                if (str.equals("counterparty")) {
                    return f4a.b.COUNTERPARTY;
                }
                break;
            case -789134272:
                if (str.equals("revolut_contact")) {
                    return f4a.b.REVOLUT_CONTACT;
                }
                break;
            case 3046160:
                if (str.equals("card")) {
                    return f4a.b.CARD;
                }
                break;
            case 98629247:
                if (str.equals("group")) {
                    return f4a.b.GROUP;
                }
                break;
            case 739065240:
                if (str.equals("charity")) {
                    return f4a.b.CHARITY;
                }
                break;
            case 825444095:
                if (str.equals("apm_contact")) {
                    return f4a.b.APM_CONTACT;
                }
                break;
            case 951526432:
                if (str.equals("contact")) {
                    return f4a.b.CONTACT;
                }
                break;
        }
        throw new IllegalStateException(str.concat(" pinned recipient type is not supported"));
    }

    public static c4a.a b(k kVar) {
        if (kVar instanceof m) {
            f5j.a aVar = ((m) kVar).f177508b;
            String str = aVar.f132330b;
            if (str == null) {
                str = aVar.f132329a;
            }
            return new c4a.a("bank_account", str);
        }
        if (kVar instanceof n) {
            return new c4a.a("card", ((n) kVar).f177510b.f81495a.f81490a);
        }
        if (kVar instanceof o) {
            return new c4a.a("charity", ((o) kVar).f177512b.f13938a);
        }
        if (kVar instanceof p) {
            zm3.a aVar2 = ((p) kVar).f177514b;
            if (aVar2 instanceof g) {
                return new c4a.a("contact", q.q((g) aVar2));
            }
            if (aVar2 instanceof zm3.p) {
                return new c4a.a("contact", q.r((zm3.p) aVar2));
            }
            if (aVar2 instanceof l) {
                return new c4a.a("revolut_contact", ((l) aVar2).getCode());
            }
            throw new NoWhenBranchMatchedException();
        }
        if (kVar instanceof r) {
            return new c4a.a("crypto_wallet", ((r) kVar).f177518b.f71059a);
        }
        if (kVar instanceof s) {
            return new c4a.a("group", ((s) kVar).f177520b.f79285a);
        }
        if (kVar instanceof jq9.l) {
            return new c4a.a("apm_contact", ((jq9.l) kVar).f177506b.getF62127a().getF62112a());
        }
        if (kVar instanceof jq9.q) {
            return new c4a.a("counterparty", ((jq9.q) kVar).f177516b.f79060a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
