package xpg;

import com.revolut.core.model.account.AccountId;
import fo3.c;
import kotlin.jvm.internal.Intrinsics;
import pcd.b;
import pcd.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final AccountId a(s sVar, c wallet) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        return sVar.f234889n == b.PERSONAL_JOINT ? new AccountId.Joint(sVar.f, wallet.f136801a) : AccountId.Personal.f51414a;
    }
}
