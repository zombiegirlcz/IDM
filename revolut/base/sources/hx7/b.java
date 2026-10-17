package hx7;

import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import ch.qos.logback.core.util.FileSize;
import com.google.android.play.core.splitinstall.internal.zzf;
import com.revolut.core.android.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.apm.bills.core.api.model.BillWarning;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardButtonsModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardCellModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardLargeButtonModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelAction;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardSectionModel;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.feature.travel.flights.models.domain.booking.BookingDetailsTraveller;
import com.revolut.feature.travel.flights.models.domain.booking.BookingDetailsTravellerBaggage;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$Page;
import com.revolut.retail.feature.balance.picker.api.models.JuniorInfo;
import ft3.d1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m2j.a0;
import net.sf.scuba.smartcards.ISOFileInfo;
import nkm.y;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.cbeff.StandardBiometricHeader;
import s7g.u0;
import s7g.x0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static final CreditCardDialogModel A(io4.g gVar) throws Throwable {
        ?? arrayList;
        CreditCardButtonsModel creditCardButtonsModel;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String title = gVar.getTitle();
        String description = gVar.getDescription();
        String buttonText = gVar.getButtonText();
        List sections = gVar.getSections();
        if (sections != null) {
            List<io4.m> list = sections;
            arrayList = new ArrayList(w.t(list, 10));
            for (io4.m mVar : list) {
                Intrinsics.checkNotNullParameter(mVar, "<this>");
                List items = mVar.getItems();
                ArrayList arrayList2 = new ArrayList(w.t(items, 10));
                Iterator it8 = items.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(jo4.a.a((io4.f) it8.next()));
                }
                arrayList.add(new CreditCardSectionModel(arrayList2));
            }
        } else {
            arrayList = f0.f322471a;
        }
        io4.a buttons = gVar.getButtons();
        if (buttons != null) {
            Intrinsics.checkNotNullParameter(buttons, "<this>");
            CreditCardLargeButtonModel creditCardLargeButtonModelQ = e.q(buttons.getPrimary());
            io4.l secondary = buttons.getSecondary();
            creditCardButtonsModel = new CreditCardButtonsModel(creditCardLargeButtonModelQ, secondary != null ? e.q(secondary) : null);
        } else {
            creditCardButtonsModel = null;
        }
        return new CreditCardDialogModel(title, description, buttonText, arrayList, creditCardButtonsModel);
    }

    public static final BookingDetailsTraveller B(x0 x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        String str = x0Var.f260813a;
        String str2 = x0Var.f260814b;
        m7g.i iVar = m7g.j.Companion;
        String str3 = x0Var.f260815c;
        iVar.getClass();
        m7g.j jVarB = m7g.i.b(str3);
        List<u0> list = x0Var.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (u0 u0Var : list) {
            Intrinsics.checkNotNullParameter(u0Var, "<this>");
            m7g.a aVar = m7g.b.Companion;
            String str4 = u0Var.f260802a;
            aVar.getClass();
            arrayList.add(new BookingDetailsTravellerBaggage(m7g.a.a(str4), u0Var.f260803b));
        }
        return new BookingDetailsTraveller(str, str2, jVarB, arrayList);
    }

    public static final lbf.c C(qbf.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = pbf.a.f234677a[bVar.ordinal()];
        if (i == 1) {
            return lbf.c.ANNUAL;
        }
        if (i == 2) {
            return lbf.c.MONTHLY;
        }
        if (i == 3) {
            return lbf.c.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final io4.g D(CreditCardDialogModel creditCardDialogModel) {
        io4.a aVar;
        Intrinsics.checkNotNullParameter(creditCardDialogModel, "<this>");
        String str = creditCardDialogModel.f68841a;
        String str2 = creditCardDialogModel.f68842b;
        String str3 = creditCardDialogModel.f68843c;
        List<CreditCardSectionModel> list = creditCardDialogModel.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (CreditCardSectionModel creditCardSectionModel : list) {
            Intrinsics.checkNotNullParameter(creditCardSectionModel, "<this>");
            List list2 = creditCardSectionModel.f68858a;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList2.add(jo4.a.b((CreditCardCellModel) it8.next()));
            }
            arrayList.add(new io4.m(arrayList2));
        }
        CreditCardButtonsModel creditCardButtonsModel = creditCardDialogModel.e;
        io4.l lVar = null;
        if (creditCardButtonsModel != null) {
            Intrinsics.checkNotNullParameter(creditCardButtonsModel, "<this>");
            CreditCardLargeButtonModel creditCardLargeButtonModel = creditCardButtonsModel.f68826a;
            Intrinsics.checkNotNullParameter(creditCardLargeButtonModel, "<this>");
            String str4 = creditCardLargeButtonModel.f68844a;
            CreditCardModelAction creditCardModelAction = creditCardLargeButtonModel.f68845b;
            io4.l lVar2 = new io4.l(creditCardModelAction != null ? jo4.b.b(creditCardModelAction) : null, str4, creditCardLargeButtonModel.f68846c.name());
            CreditCardLargeButtonModel creditCardLargeButtonModel2 = creditCardButtonsModel.f68827b;
            if (creditCardLargeButtonModel2 != null) {
                Intrinsics.checkNotNullParameter(creditCardLargeButtonModel2, "<this>");
                String str5 = creditCardLargeButtonModel2.f68844a;
                CreditCardModelAction creditCardModelAction2 = creditCardLargeButtonModel2.f68845b;
                lVar = new io4.l(creditCardModelAction2 != null ? jo4.b.b(creditCardModelAction2) : null, str5, creditCardLargeButtonModel2.f68846c.name());
            }
            aVar = new io4.a(lVar2, lVar);
        } else {
            aVar = null;
        }
        return new io4.g(str, str2, str3, arrayList, aVar);
    }

    public static final qbf.b E(lbf.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = pbf.a.f234678b[cVar.ordinal()];
        if (i == 1) {
            return qbf.b.ANNUAL;
        }
        if (i == 2) {
            return qbf.b.MONTHLY;
        }
        if (i == 3) {
            return qbf.b.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final zel.f F(ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$Page) {
        Intrinsics.checkNotNullParameter(screenerAllFiltersFlowContract$Page, "<this>");
        int i = xoh.q.f307848a[screenerAllFiltersFlowContract$Page.ordinal()];
        if (i == 1) {
            return zel.f.STOCKS;
        }
        if (i == 2) {
            return zel.f.ETP;
        }
        if (i == 3) {
            return zel.f.BOND;
        }
        if (i == 4) {
            return zel.f.CFD;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ScreenerAllFiltersFlowContract$Page G(zel.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i = xoh.q.f307849b[fVar.ordinal()];
        if (i == 1) {
            return ScreenerAllFiltersFlowContract$Page.STOCKS;
        }
        if (i == 2) {
            return ScreenerAllFiltersFlowContract$Page.ETP;
        }
        if (i == 3) {
            return ScreenerAllFiltersFlowContract$Page.BOND;
        }
        if (i == 4) {
            return ScreenerAllFiltersFlowContract$Page.CFD;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static X509Certificate[][] H(String str) {
        Pair pairB;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                pairB = null;
            } else {
                pairB = e.B(randomAccessFile, 0);
                if (pairB == null) {
                    pairB = e.B(randomAccessFile, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                }
            }
            if (pairB == null) {
                throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairB.first;
            long jLongValue = ((Long) pairB.second).longValue();
            long j2 = jLongValue - 20;
            if (j2 >= 0) {
                randomAccessFile.seek(j2);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzf("ZIP64 APK not supported");
                }
            }
            e.C(byteBuffer);
            long j3 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & BodyPartID.bodyIdMax;
            if (j3 >= jLongValue) {
                throw new zzf("ZIP Central Directory offset out of range: " + j3 + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            e.C(byteBuffer);
            if ((((long) byteBuffer.getInt(byteBuffer.position() + 12)) & BodyPartID.bodyIdMax) + j3 != jLongValue) {
                throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j3 < 32) {
                throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + j3);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(j3 - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new zzf("No APK Signing Block before ZIP Central Directory");
            }
            long j5 = byteBufferAllocate.getLong(0);
            long j16 = j3;
            if (j5 < byteBufferAllocate.capacity() || j5 > 2147483639) {
                throw new zzf("APK Signing Block size out of range: " + j5);
            }
            int i = (int) (8 + j5);
            long j22 = j16 - ((long) i);
            if (j22 < 0) {
                throw new zzf("APK Signing Block offset out of range: " + j22);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j22);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j42 = byteBufferAllocate2.getLong(0);
            if (j42 != j5) {
                throw new zzf("APK Signing Block sizes in header and footer do not match: " + j42 + " vs " + j5);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j22));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                int i2 = 0;
                while (byteBufferSlice.hasRemaining()) {
                    i2++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i2);
                    }
                    long j46 = byteBufferSlice.getLong();
                    if (j46 < 4 || j46 > 2147483647L) {
                        throw new zzf("APK Signing Block entry #" + i2 + " size out of range: " + j46);
                    }
                    int i3 = (int) j46;
                    int iPosition2 = byteBufferSlice.position() + i3;
                    if (i3 > byteBufferSlice.remaining()) {
                        throw new zzf("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrR = R(randomAccessFile.getChannel(), new wc.o(L(byteBufferSlice, i3 - 4), jLongValue2, j16, jLongValue, byteBuffer));
                        randomAccessFile.close();
                        return x509CertificateArrR;
                    }
                    long j47 = jLongValue2;
                    long j57 = jLongValue;
                    long j58 = j16;
                    ByteBuffer byteBuffer3 = byteBuffer;
                    byteBufferSlice.position(iPosition2);
                    jLongValue = j57;
                    byteBuffer = byteBuffer3;
                    j16 = j58;
                    jLongValue2 = j47;
                }
                throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th10) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th10;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int I(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(a0.d.n("Unknown content digest algorthm: ", i));
    }

    public static int J(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE /* 257 */:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
    }

    public static String K(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(a0.d.n("Unknown content digest algorthm: ", i));
    }

    public static ByteBuffer L(ByteBuffer byteBuffer, int i) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer M(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(a0.d.n("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return L(byteBuffer, i);
        }
        throw new IOException(a0.d.g(i, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
    }

    public static void N(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static byte[] O(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new IOException(a0.d.g(i, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static X509Certificate[] P(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferM = M(byteBuffer);
        ByteBuffer byteBufferM2 = M(byteBuffer);
        byte[] bArrO = O(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrO2 = null;
        byte[] bArrO3 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferM2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferM3 = M(byteBufferM2);
                if (byteBufferM3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferM3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE /* 257 */:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iJ = J(i3);
                    int iJ2 = J(i);
                    if (iJ != 1 && iJ2 == 1) {
                    }
                }
                bArrO3 = O(byteBufferM3);
                i = i3;
            } catch (IOException e) {
                e = e;
                throw new SecurityException(a0.d.n("Failed to parse signature record #", i2), e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new SecurityException(a0.d.n("Failed to parse signature record #", i2), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE /* 257 */:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE /* 257 */:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrO));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferM);
            if (!signature.verify(bArrO3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferM.clear();
            ByteBuffer byteBufferM4 = M(byteBufferM);
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            while (byteBufferM4.hasRemaining()) {
                i5++;
                try {
                    ByteBuffer byteBufferM5 = M(byteBufferM4);
                    if (byteBufferM5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i6 = byteBufferM5.getInt();
                    arrayList2.add(Integer.valueOf(i6));
                    if (i6 == i) {
                        bArrO2 = O(byteBufferM5);
                    }
                } catch (IOException e4) {
                    e = e4;
                    throw new IOException(a0.d.n("Failed to parse digest record #", i5), e);
                } catch (BufferUnderflowException e5) {
                    e = e5;
                    throw new IOException(a0.d.n("Failed to parse digest record #", i5), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iJ3 = J(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iJ3), bArrO2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrO2)) {
                throw new SecurityException(K(iJ3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferM6 = M(byteBufferM);
            ArrayList arrayList3 = new ArrayList();
            int i21 = 0;
            while (byteBufferM6.hasRemaining()) {
                i21++;
                byte[] bArrO4 = O(byteBufferM6);
                try {
                    arrayList3.add(new wc.p((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrO4)), bArrO4));
                } catch (CertificateException e6) {
                    throw new SecurityException(a0.d.n("Failed to decode certificate #", i21), e6);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrO, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e22) {
            e = e22;
            throw new SecurityException(p.a.p("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e33) {
            e = e33;
            throw new SecurityException(p.a.p("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e35) {
            e = e35;
            throw new SecurityException(p.a.p("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e41) {
            e = e41;
            throw new SecurityException(p.a.p("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e45) {
            e = e45;
            throw new SecurityException(p.a.p("Failed to verify ", str2, " signature"), e);
        }
    }

    public static byte[][] Q(int[] iArr, wc.e[] eVarArr) throws DigestException {
        long j2;
        int i;
        int length;
        char c2;
        int i2 = 0;
        long jZza = 0;
        while (true) {
            j2 = FileSize.MB_COEFFICIENT;
            if (i2 >= 3) {
                break;
            }
            jZza += (eVarArr[i2].zza() + 1048575) / FileSize.MB_COEFFICIENT;
            i2++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(p.a.m(jZza, "Too many chunks: "));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i3 = 0;
        while (true) {
            length = iArr.length;
            c2 = 5;
            if (i3 >= length) {
                break;
            }
            int i5 = (int) jZza;
            byte[] bArr2 = new byte[(I(iArr[i3]) * i5) + 5];
            bArr2[0] = 90;
            N(i5, bArr2);
            bArr[i3] = bArr2;
            i3++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = ISOFileInfo.A5;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            String strK = K(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(strK);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(strK.concat(" digest not supported"), e);
            }
        }
        int i21 = 0;
        int i22 = 0;
        int i32 = 0;
        for (i = 3; i21 < i; i = 3) {
            wc.e eVar = eVarArr[i21];
            int i33 = i21;
            long jZza2 = eVar.zza();
            long j3 = 0;
            while (jZza2 > 0) {
                char c3 = c2;
                int i43 = i22;
                int iMin = (int) Math.min(jZza2, j2);
                N(iMin, bArr3);
                for (int i59 = 0; i59 < length; i59++) {
                    messageDigestArr[i59].update(bArr3);
                }
                try {
                    eVar.a(messageDigestArr, j3, iMin);
                    int i66 = 0;
                    while (i66 < iArr.length) {
                        int i74 = iArr[i66];
                        byte[] bArr4 = bArr[i66];
                        int I = I(i74);
                        wc.e eVar2 = eVar;
                        MessageDigest messageDigest = messageDigestArr[i66];
                        long j5 = jZza2;
                        int iDigest = messageDigest.digest(bArr4, (i43 * I) + 5, I);
                        if (iDigest != I) {
                            throw new RuntimeException(v1.c.t(iDigest, "Unexpected output size of ", messageDigest.getAlgorithm(), " digest: "));
                        }
                        i66++;
                        eVar = eVar2;
                        jZza2 = j5;
                    }
                    wc.e eVar3 = eVar;
                    long j16 = iMin;
                    j3 += j16;
                    jZza2 -= j16;
                    i22 = i43 + 1;
                    c2 = c3;
                    eVar = eVar3;
                    j2 = FileSize.MB_COEFFICIENT;
                } catch (IOException e2) {
                    throw new DigestException(a0.d.g(i43, i32, "Failed to digest chunk #", " of section #"), e2);
                }
            }
            i32++;
            i21 = i33 + 1;
            j2 = FileSize.MB_COEFFICIENT;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i92 = 0; i92 < iArr.length; i92++) {
            int i96 = iArr[i92];
            byte[] bArr6 = bArr[i92];
            String strK2 = K(i96);
            try {
                bArr5[i92] = MessageDigest.getInstance(strK2).digest(bArr6);
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(strK2.concat(" digest not supported"), e4);
            }
        }
        return bArr5;
    }

    public static X509Certificate[][] R(FileChannel fileChannel, wc.o oVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferM = M(oVar.f296299a);
                int i = 0;
                while (byteBufferM.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(P(M(byteBufferM), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(j6.a.l(i, "Failed to parse/verify signer #", " block"), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j2 = oVar.f296300b;
                long j3 = oVar.f296301c;
                long j5 = oVar.d;
                ByteBuffer byteBuffer = oVar.e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                wc.m mVar = new wc.m(fileChannel, 0L, j2);
                wc.m mVar2 = new wc.m(fileChannel, j3, j5 - j3);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                e.C(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j2 < 0 || j2 > BodyPartID.bodyIdMax) {
                    throw new IllegalArgumentException(p.a.m(j2, "uint32 value of out range: "));
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j2);
                ugc.a aVar = new ugc.a(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it8 = map.keySet().iterator();
                int i2 = 0;
                while (it8.hasNext()) {
                    iArr[i2] = ((Integer) it8.next()).intValue();
                    i2++;
                }
                try {
                    byte[][] bArrQ = Q(iArr, new wc.e[]{mVar, mVar2, aVar});
                    for (int i3 = 0; i3 < size; i3++) {
                        int i5 = iArr[i3];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i5)), bArrQ[i3])) {
                            throw new SecurityException(K(i5).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e2) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                }
            } catch (IOException e4) {
                throw new SecurityException("Failed to read list of signers", e4);
            }
        } catch (CertificateException e5) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e5);
        }
    }

    public static final od0.c a() {
        return od0.c.GLOBAL;
    }

    public static final String b(xkg.e eVar) {
        if (eVar instanceof xkg.c) {
            return "Finished";
        }
        if (eVar instanceof xkg.b) {
            return "Closed";
        }
        if (eVar instanceof xkg.d) {
            return ((xkg.d) eVar).f306813a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final JuniorInfo c(a0 a0Var) {
        JuniorBankingProfile juniorBankingProfile = a0Var.f202011a;
        return new JuniorInfo(juniorBankingProfile.f77103j, juniorBankingProfile.f77099b, juniorBankingProfile.f77100c, juniorBankingProfile.f77101g, a0Var.f202013c, a0Var.f202012b);
    }

    public static final void d(TextView textView, v01.b textStyle) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        w(textView, textStyle.f284709a);
        e(textView, textStyle);
    }

    public static final void e(TextView textView, v01.b textStyle) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        textStyle.getClass();
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iX = kli.a.x(textStyle.f284710b, context);
        Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView.setTextColor(kli.a.t(iX, context2));
        Context context3 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textView.setTypeface(v01.f.b(context3, textStyle.f284711c));
        if (textStyle.d != null) {
            textView.setTextSize(textStyle.e, r0.intValue());
        }
    }

    public static final gq0.b f(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "<this>");
        return new gq0.b(clause);
    }

    public static final rkm.b g(boolean z) {
        rkm.i trace = rkm.i.f254901a;
        Intrinsics.checkNotNullParameter(trace, "trace");
        Intrinsics.checkNotNullParameter(trace, "trace");
        rkm.b bVar = new rkm.b();
        bVar.f254894a = z ? 1 : 0;
        return bVar;
    }

    public static final rkm.d h(int i) {
        rkm.i trace = rkm.i.f254901a;
        Intrinsics.checkNotNullParameter(trace, "trace");
        Intrinsics.checkNotNullParameter(trace, "trace");
        rkm.d dVar = new rkm.d();
        dVar.f254896a = i;
        return dVar;
    }

    public static final rkm.f i() {
        rkm.i trace = rkm.i.f254901a;
        Intrinsics.checkNotNullParameter(trace, "trace");
        Intrinsics.checkNotNullParameter(trace, "trace");
        rkm.f fVar = new rkm.f();
        fVar.f254898a = 0L;
        return fVar;
    }

    public static final rkm.h j(Object obj2) {
        rkm.i trace = rkm.i.f254901a;
        Intrinsics.checkNotNullParameter(trace, "trace");
        Intrinsics.checkNotNullParameter(trace, "trace");
        rkm.h hVar = new rkm.h();
        hVar.f254900a = obj2;
        return hVar;
    }

    public static final fk.b k(View clicks) {
        Intrinsics.j(clicks, "$this$clicks");
        return new fk.b(clicks);
    }

    public static final String l(io3.e eVar, String prefix) {
        String strV0;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        String str = (String) eVar.f163162c.get("ACCOUNT_NUMBER");
        if (str == null || (strV0 = kotlin.text.f0.V0(4, str)) == null) {
            return null;
        }
        return prefix.concat(strV0);
    }

    public static final n9l.a m(ArrayList arrayList, xi0.b source, xi0.b target) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            n9l.a aVar = (n9l.a) it8.next();
            if (Intrinsics.f(aVar.f213661a, source) && Intrinsics.f(aVar.f213662b, target)) {
                return aVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final d1 n(it3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new d1(dVar.f168328j, dVar.k, null);
    }

    public static final boolean o(ba6.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return lVar.f13948q == ba6.j.AVAILABLE;
    }

    public static final boolean p(UserVoucher userVoucher, long j2) {
        Long l2;
        Intrinsics.checkNotNullParameter(userVoucher, "<this>");
        Intrinsics.checkNotNullParameter(userVoucher, "<this>");
        tvb.d dVar = userVoucher.i;
        tvb.d dVar2 = tvb.d.USED;
        if (dVar == dVar2) {
            return true;
        }
        Intrinsics.checkNotNullParameter(userVoucher, "<this>");
        if (userVoucher.f83620b != tvb.e.INTERNAL) {
            return false;
        }
        Intrinsics.checkNotNullParameter(userVoucher, "<this>");
        return (userVoucher.i == dVar2 || (l2 = userVoucher.d) == null || l2.longValue() > j2) ? false : true;
    }

    public static final String q(yte.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return "TOPUP_METHODS_MEMORY_KEY-" + nVar;
    }

    public static final void r(Set extensions, Bundle savedState) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Iterator it8 = extensions.iterator();
        while (it8.hasNext()) {
            yji.d dVar = (yji.d) it8.next();
            if (dVar instanceof yji.p) {
                yji.p pVar = (yji.p) dVar;
                Bundle bundle = savedState.getBundle(pVar.Q());
                if (bundle != null) {
                    pVar.e(bundle);
                }
            }
        }
    }

    public static final void s(Set extensions, Bundle outState) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(outState, "outState");
        Iterator it8 = extensions.iterator();
        while (it8.hasNext()) {
            yji.d dVar = (yji.d) it8.next();
            if (dVar instanceof yji.p) {
                Bundle bundle = new Bundle();
                yji.p pVar = (yji.p) dVar;
                pVar.g(bundle);
                outState.putBundle(pVar.Q(), bundle);
            }
        }
    }

    public static final String t(TopUpMethodsContext topUpMethodsContext) {
        Intrinsics.checkNotNullParameter(topUpMethodsContext, "<this>");
        return "SELECTED_METHOD_MEMORY_KEY-TopUpMethodsContext(currencyCode=" + topUpMethodsContext.f90550a + ", contextType=" + topUpMethodsContext.f90551b + ")";
    }

    public static final void u(List list, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        pd.b.q(view, true);
        String strU = list != null ? y.u(y.n(y.x(d0.Q(list), new ccb.b(view, 3)), new gn.a(21)), ", ", null, 62) : null;
        if (strU == null || strU.length() == 0) {
            return;
        }
        view.setContentDescription(strU);
    }

    public static final void v(View view, String str) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R$id.internal_ui_test_view_id, str);
        ko0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        od0.a aVar = od0.a.f224253a;
        if (od0.a.c() != od0.l.E2E) {
            return;
        }
        AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(view);
        if (accessibilityDelegate == null && str == null) {
            return;
        }
        if (accessibilityDelegate == null && str != null) {
            ViewCompat.setAccessibilityDelegate(view, new ko0.b(str));
            return;
        }
        boolean z = accessibilityDelegate instanceof ko0.b;
        if (z && str == null) {
            ViewCompat.setAccessibilityDelegate(view, null);
            return;
        }
        if (z) {
            ((ko0.b) accessibilityDelegate).f186201a = str;
            return;
        }
        if (accessibilityDelegate != null && str == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "CustomUITestsIdAccessibilityDelegate", "Can't reset a custom id due to unknown ".concat(accessibilityDelegate.getClass().getName()), null, null, 16);
        } else {
            if (accessibilityDelegate != null && str != null) {
                ViewCompat.setAccessibilityDelegate(view, new ko0.b(str));
                return;
            }
            throw new IllegalStateException(("Unreachable state: " + accessibilityDelegate + ", " + view).toString());
        }
    }

    public static final void w(TextView textView, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            Intrinsics.h(spans);
            for (Object obj2 : spans) {
                if (obj2 instanceof ClickableSpan) {
                    textView.setMovementMethod(new LinkMovementMethod());
                }
            }
        }
        textView.setText(charSequence);
    }

    public static final String x(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static final ChronoUnit y(c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        int i = yoc.c.f315645a[c0Var.ordinal()];
        if (i == 1) {
            return ChronoUnit.DAYS;
        }
        if (i == 2) {
            return ChronoUnit.WEEKS;
        }
        if (i == 3) {
            return ChronoUnit.MONTHS;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final BillWarning z(gp1.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new BillWarning(eVar.getTitle(), eVar.getDescription(), eVar.getAction());
    }
}
