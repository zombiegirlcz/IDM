package gi1;

import cli.y;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.CountryState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import s7a.a0;
import s7a.c0;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.address.common.impl.flow.screen.add.a f144045b;

    public /* synthetic */ o(com.revolut.feature.address.common.impl.flow.screen.add.a aVar, int i) {
        this.f144044a = i;
        this.f144045b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair;
        Address addressCopy;
        switch (this.f144044a) {
            case 0:
                String text = (String) obj2;
                Intrinsics.checkNotNullParameter(text, "text");
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar = this.f144045b;
                aVar.H2(aVar.C, new g58.h(text, 12));
                return Unit.f186387a;
            case 1:
                Address validatedAddress = (Address) obj2;
                Intrinsics.checkNotNullParameter(validatedAddress, "validatedAddress");
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar2 = this.f144045b;
                y yVar = aVar2.C;
                j jVar = ((k) ((j2) yVar.f22677a).getValue()).k;
                Address address = (jVar == null || !Intrinsics.f(validatedAddress, jVar.f144026b)) ? null : jVar.f144027c;
                j jVar2 = ((k) ((j2) yVar.f22677a).getValue()).k;
                aVar2.C2(new l(validatedAddress, address, jVar2 != null ? jVar2.f144025a : null, "ADD_ADDRESS_SUBMIT_BUTTON_TAG"));
                return Unit.f186387a;
            case 2:
                sh1.h fields = (sh1.h) obj2;
                Intrinsics.checkNotNullParameter(fields, "fields");
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar3 = this.f144045b;
                aVar3.H2(aVar3.C, new gd3.i(fields, 16));
                return Unit.f186387a;
            case 3:
                String text2 = (String) obj2;
                Intrinsics.checkNotNullParameter(text2, "text");
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar4 = this.f144045b;
                aVar4.H2(aVar4.C, new g58.h(text2, 16));
                return Unit.f186387a;
            case 4:
                bi1.c output = (bi1.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                String str = output.f15371a;
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar5 = this.f144045b;
                y yVar2 = aVar5.C;
                if (!Intrinsics.f(str, ((k) ((j2) yVar2.f22677a).getValue()).f144028a.f263348c.f263344a)) {
                    aVar5.H2(yVar2, new gd3.i(output, 17));
                }
                return Unit.f186387a;
            case 5:
                hi1.e output2 = (hi1.e) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof hi1.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar6 = this.f144045b;
                aVar6.H2(aVar6.C, new gd3.i(output2, 18));
                return Unit.f186387a;
            case 6:
                a0 output3 = (a0) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                c0 c0Var = output3.f260599a;
                if (c0Var instanceof c8a.a) {
                    Address empty = Address.INSTANCE.getEMPTY();
                    Address addressCopy2 = empty.copy((32704 & 1) != 0 ? empty.streetLine1 : null, (32704 & 2) != 0 ? empty.streetLine2 : null, (32704 & 4) != 0 ? empty.region : null, (32704 & 8) != 0 ? empty.city : null, (32704 & 16) != 0 ? empty.postcode : null, (32704 & 32) != 0 ? empty.country : ((c8a.a) c0Var).f22154a, (32704 & 64) != 0 ? empty.fullAddress : null, (32704 & 128) != 0 ? empty.streetType : null, (32704 & 256) != 0 ? empty.street : null, (32704 & 512) != 0 ? empty.houseNumber : null, (32704 & 1024) != 0 ? empty.flat : null, (32704 & 2048) != 0 ? empty.neighborhood : null, (32704 & 4096) != 0 ? empty.houseName : null, (32704 & 8192) != 0 ? empty.type : null, (32704 & 16384) != 0 ? empty.landmark : null);
                    CountryState empty2 = CountryState.INSTANCE.getEMPTY();
                    com.revolut.feature.address.common.impl.flow.screen.add.a aVar7 = this.f144045b;
                    aVar7.B = empty2;
                    aVar7.H2(aVar7.C, new avj.p(aVar7, addressCopy2, 5));
                    aVar7.N2();
                }
                return Unit.f186387a;
            case 7:
                String text3 = (String) obj2;
                Intrinsics.checkNotNullParameter(text3, "text");
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar8 = this.f144045b;
                aVar8.H2(aVar8.C, new g58.h(text3, 18));
                return Unit.f186387a;
            case 8:
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar9 = this.f144045b;
                y yVar3 = aVar9.C;
                a0 output4 = (a0) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                c0 c0Var2 = output4.f260599a;
                if ((c0Var2 instanceof vi1.s) && !Intrinsics.f(((vi1.s) c0Var2).f289518a, ((k) ((j2) yVar3.f22677a).getValue()).f144028a.f.f263344a)) {
                    aVar9.H2(yVar3, new p(c0Var2, 0));
                }
                return Unit.f186387a;
            case 9:
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar10 = this.f144045b;
                y yVar4 = aVar10.C;
                a0 output5 = (a0) obj2;
                Intrinsics.checkNotNullParameter(output5, "output");
                c0 c0Var3 = output5.f260599a;
                if (c0Var3 instanceof vi1.q) {
                    CountryState countryState = ((vi1.q) c0Var3).f289515a;
                    String code = countryState.getCode();
                    String code2 = aVar10.B.getCode();
                    if (d0.W(code2)) {
                        code2 = ((k) ((j2) yVar4.f22677a).getValue()).f144028a.d.f263344a;
                    }
                    if (!Intrinsics.f(code, code2)) {
                        aVar10.B = countryState;
                        aVar10.H2(yVar4, new p(c0Var3, 2));
                    }
                }
                return Unit.f186387a;
            case 10:
                th1.d output6 = (th1.d) obj2;
                Intrinsics.checkNotNullParameter(output6, "output");
                boolean z = output6 instanceof th1.b;
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar11 = this.f144045b;
                if (z) {
                    Address empty3 = Address.INSTANCE.getEMPTY();
                    String strK2 = aVar11.K2();
                    String strK22 = aVar11.K2();
                    String str2 = ((th1.b) output6).f271241a;
                    wi0.b.Companion.getClass();
                    pair = new Pair(empty3.copy((32704 & 1) != 0 ? empty3.streetLine1 : null, (32704 & 2) != 0 ? empty3.streetLine2 : null, (32704 & 4) != 0 ? empty3.region : null, (32704 & 8) != 0 ? empty3.city : null, (32704 & 16) != 0 ? empty3.postcode : Intrinsics.f(strK22, "JP") ? str2 : null, (32704 & 32) != 0 ? empty3.country : strK2, (32704 & 64) != 0 ? empty3.fullAddress : null, (32704 & 128) != 0 ? empty3.streetType : null, (32704 & 256) != 0 ? empty3.street : null, (32704 & 512) != 0 ? empty3.houseNumber : null, (32704 & 1024) != 0 ? empty3.flat : null, (32704 & 2048) != 0 ? empty3.neighborhood : null, (32704 & 4096) != 0 ? empty3.houseName : null, (32704 & 8192) != 0 ? empty3.type : null, (32704 & 16384) != 0 ? empty3.landmark : null), null);
                } else {
                    if (!(output6 instanceof th1.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    th1.c cVar = (th1.c) output6;
                    Address address2 = cVar.f271242a;
                    pair = new Pair(address2.copy((32704 & 1) != 0 ? address2.streetLine1 : null, (32704 & 2) != 0 ? address2.streetLine2 : null, (32704 & 4) != 0 ? address2.region : null, (32704 & 8) != 0 ? address2.city : null, (32704 & 16) != 0 ? address2.postcode : null, (32704 & 32) != 0 ? address2.country : null, (32704 & 64) != 0 ? address2.fullAddress : "", (32704 & 128) != 0 ? address2.streetType : null, (32704 & 256) != 0 ? address2.street : null, (32704 & 512) != 0 ? address2.houseNumber : null, (32704 & 1024) != 0 ? address2.flat : null, (32704 & 2048) != 0 ? address2.neighborhood : null, (32704 & 4096) != 0 ? address2.houseName : null, (32704 & 8192) != 0 ? address2.type : null, (32704 & 16384) != 0 ? address2.landmark : null), new j(cVar.f271242a, cVar.f271243b, cVar.f271244c));
                }
                Address address3 = (Address) pair.f186385a;
                j jVar3 = (j) pair.f186386b;
                aVar11.B = CountryState.INSTANCE.getEMPTY();
                aVar11.H2(aVar11.C, new gbi.c(aVar11, address3, jVar3, 17));
                return Unit.f186387a;
            case 11:
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar12 = this.f144045b;
                y yVar5 = aVar12.C;
                a0 output7 = (a0) obj2;
                Intrinsics.checkNotNullParameter(output7, "output");
                c0 c0Var4 = output7.f260599a;
                if ((c0Var4 instanceof vi1.j) && !Intrinsics.f(((vi1.j) c0Var4).f289506a, ((k) ((j2) yVar5.f22677a).getValue()).f144028a.f263348c.f263344a)) {
                    aVar12.H2(yVar5, new p(c0Var4, 1));
                }
                return Unit.f186387a;
            case 12:
                th1.h output8 = (th1.h) obj2;
                Intrinsics.checkNotNullParameter(output8, "output");
                boolean z3 = output8 instanceof th1.f;
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar13 = this.f144045b;
                if (z3) {
                    Address empty4 = Address.INSTANCE.getEMPTY();
                    addressCopy = empty4.copy((32704 & 1) != 0 ? empty4.streetLine1 : null, (32704 & 2) != 0 ? empty4.streetLine2 : null, (32704 & 4) != 0 ? empty4.region : null, (32704 & 8) != 0 ? empty4.city : null, (32704 & 16) != 0 ? empty4.postcode : ((th1.f) output8).f271246a, (32704 & 32) != 0 ? empty4.country : aVar13.K2(), (32704 & 64) != 0 ? empty4.fullAddress : null, (32704 & 128) != 0 ? empty4.streetType : null, (32704 & 256) != 0 ? empty4.street : null, (32704 & 512) != 0 ? empty4.houseNumber : null, (32704 & 1024) != 0 ? empty4.flat : null, (32704 & 2048) != 0 ? empty4.neighborhood : null, (32704 & 4096) != 0 ? empty4.houseName : null, (32704 & 8192) != 0 ? empty4.type : null, (32704 & 16384) != 0 ? empty4.landmark : null);
                } else {
                    if (!(output8 instanceof th1.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Address address4 = ((th1.g) output8).f271247a;
                    addressCopy = address4.copy((32704 & 1) != 0 ? address4.streetLine1 : null, (32704 & 2) != 0 ? address4.streetLine2 : null, (32704 & 4) != 0 ? address4.region : null, (32704 & 8) != 0 ? address4.city : null, (32704 & 16) != 0 ? address4.postcode : null, (32704 & 32) != 0 ? address4.country : null, (32704 & 64) != 0 ? address4.fullAddress : "", (32704 & 128) != 0 ? address4.streetType : null, (32704 & 256) != 0 ? address4.street : null, (32704 & 512) != 0 ? address4.houseNumber : null, (32704 & 1024) != 0 ? address4.flat : null, (32704 & 2048) != 0 ? address4.neighborhood : null, (32704 & 4096) != 0 ? address4.houseName : null, (32704 & 8192) != 0 ? address4.type : null, (32704 & 16384) != 0 ? address4.landmark : null);
                }
                aVar13.B = CountryState.INSTANCE.getEMPTY();
                aVar13.H2(aVar13.C, new avj.p(aVar13, addressCopy, 6));
                return Unit.f186387a;
            case 13:
                String text4 = (String) obj2;
                Intrinsics.checkNotNullParameter(text4, "text");
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar14 = this.f144045b;
                aVar14.H2(aVar14.C, new g58.h(text4, 17));
                return Unit.f186387a;
            case 14:
                String text5 = (String) obj2;
                Intrinsics.checkNotNullParameter(text5, "text");
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar15 = this.f144045b;
                aVar15.H2(aVar15.C, new g58.h(text5, 13));
                return Unit.f186387a;
            case 15:
                String text6 = (String) obj2;
                Intrinsics.checkNotNullParameter(text6, "text");
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar16 = this.f144045b;
                aVar16.H2(aVar16.C, new g58.h(text6, 20));
                return Unit.f186387a;
            case 16:
                String text7 = (String) obj2;
                Intrinsics.checkNotNullParameter(text7, "text");
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar17 = this.f144045b;
                aVar17.H2(aVar17.C, new g58.h(text7, 21));
                return Unit.f186387a;
            case 17:
                String text8 = (String) obj2;
                Intrinsics.checkNotNullParameter(text8, "text");
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar18 = this.f144045b;
                aVar18.H2(aVar18.C, new g58.h(text8, 14));
                return Unit.f186387a;
            case 18:
                String text9 = (String) obj2;
                Intrinsics.checkNotNullParameter(text9, "text");
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar19 = this.f144045b;
                aVar19.H2(aVar19.C, new g58.h(text9, 15));
                return Unit.f186387a;
            default:
                String text10 = (String) obj2;
                Intrinsics.checkNotNullParameter(text10, "text");
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar20 = this.f144045b;
                aVar20.H2(aVar20.C, new g58.h(text10, 19));
                return Unit.f186387a;
        }
    }
}
