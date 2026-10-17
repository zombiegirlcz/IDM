package b48;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import n38.e0;
import n38.q;
import n38.r;
import n38.s;
import n38.t;
import n38.u;
import n38.v;
import n38.y;
import org.jetbrains.annotations.NotNull;
import z38.e;
import z38.g;
import z38.i;
import z38.l;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    @NotNull
    public static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m38.a f12200a;

    public b(m38.a relationshipMapper) {
        Intrinsics.checkNotNullParameter(relationshipMapper, "relationshipMapper");
        this.f12200a = relationshipMapper;
    }

    public static n38.a a(z38.a jointAccountDto) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(jointAccountDto, "jointAccountDto");
        String memberId = jointAccountDto.getMemberId();
        String walletId = jointAccountDto.getWalletId();
        String state = jointAccountDto.getState();
        q qVarValueOf = null;
        if (state != null) {
            try {
                qVarValueOf = q.valueOf(state);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
        if (qVarValueOf == q.ACTIVE && (Intrinsics.f(jointAccountDto.getKyc(), "NONE") || Intrinsics.f(jointAccountDto.getKyc(), "FAILED"))) {
            qVarValueOf = q.PENDING;
        }
        List<i> members = jointAccountDto.getMembers();
        ArrayList arrayList = new ArrayList(w.t(members, 10));
        for (i iVar : members) {
            String id10 = iVar.getId();
            String legalName = iVar.getLegalName();
            if (legalName == null) {
                legalName = "";
            }
            String firstName = iVar.getFirstName();
            if (firstName == null) {
                firstName = "";
            }
            String lastName = iVar.getLastName();
            if (lastName == null) {
                lastName = "";
            }
            String code = iVar.getCode();
            if (code == null) {
                String str4 = lastName;
                str3 = "";
                str = firstName;
                str2 = str4;
            } else {
                str = firstName;
                str2 = lastName;
                str3 = code;
            }
            arrayList.add(new y(id10, legalName, str, str2, str3));
        }
        return new n38.a(memberId, walletId, qVarValueOf, arrayList);
    }

    public static r c(z38.d jointEligibilityDto) {
        Intrinsics.checkNotNullParameter(jointEligibilityDto, "jointEligibilityDto");
        s sVar = (s) u1.v(jointEligibilityDto.getStatus(), c.b());
        if (sVar == null) {
            sVar = s.INELIGIBLE;
        }
        Boolean dualConsentRequired = jointEligibilityDto.getDualConsentRequired();
        return new r(sVar, dualConsentRequired != null ? dualConsentRequired.booleanValue() : false);
    }

    public final e0 b(l invitationDto) {
        v vVar;
        Intrinsics.checkNotNullParameter(invitationDto, "invitationDto");
        String id10 = invitationDto.getId();
        Object objV = u1.v(invitationDto.getState(), c.c());
        if (objV == null) {
            throw new IllegalStateException("Unsupported state");
        }
        t tVar = (t) objV;
        List<g> users = invitationDto.getUsers();
        ArrayList arrayList = new ArrayList(w.t(users, 10));
        for (g gVar : users) {
            String name = gVar.getName();
            String phone = gVar.getPhone();
            Object objV2 = u1.v(gVar.getState(), c.d());
            if (objV2 == null) {
                throw new IllegalStateException("Unsupported state");
            }
            arrayList.add(new u(name, phone, (n38.w) objV2));
        }
        Boolean isVulnerable = invitationDto.getIsVulnerable();
        boolean zBooleanValue = isVulnerable != null ? isVulnerable.booleanValue() : false;
        e inviteDetail = invitationDto.getInviteDetail();
        if (inviteDetail != null) {
            String relationship = inviteDetail.getRelationship();
            if (relationship == null) {
                relationship = "";
            }
            j38.a aVarA = ((d) this.f12200a).a(relationship);
            List purposes = inviteDetail.getPurposes();
            if (purposes == null) {
                purposes = f0.f322471a;
            }
            vVar = new v(aVarA, purposes);
        } else {
            vVar = null;
        }
        return new e0(id10, invitationDto.getWorkflowId(), arrayList, tVar, zBooleanValue, vVar, invitationDto.getExpiresAt());
    }
}
