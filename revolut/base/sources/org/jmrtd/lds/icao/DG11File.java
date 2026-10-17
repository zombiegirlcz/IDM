package org.jmrtd.lds.icao;

import ehe.n;
import j6.a;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class DG11File extends AdditionalDetailDataGroup {
    public static final int CUSTODY_INFORMATION_TAG = 24344;
    public static final int FULL_DATE_OF_BIRTH_TAG = 24363;
    public static final int FULL_NAME_TAG = 24334;
    public static final int OTHER_NAME_TAG = 24335;
    public static final int OTHER_VALID_TD_NUMBERS_TAG = 24343;
    public static final int PERMANENT_ADDRESS_TAG = 24386;
    public static final int PERSONAL_NUMBER_TAG = 24336;
    public static final int PERSONAL_SUMMARY_TAG = 24341;
    public static final int PLACE_OF_BIRTH_TAG = 24337;
    public static final int PROFESSION_TAG = 24339;
    public static final int PROOF_OF_CITIZENSHIP_TAG = 24342;
    private static final String SDF = "yyyyMMdd";
    public static final int TAG_LIST_TAG = 92;
    public static final int TELEPHONE_TAG = 24338;
    public static final int TITLE_TAG = 24340;
    private static final long serialVersionUID = 8566312538928662937L;
    private String custodyInformation;
    private String fullDateOfBirth;
    private String nameOfHolder;
    private List<String> otherNames;
    private List<String> otherValidTDNumbers;
    private List<String> permanentAddress;
    private String personalNumber;
    private String personalSummary;
    private List<String> placeOfBirth;
    private String profession;
    private byte[] proofOfCitizenship;
    private List<Integer> tagPresenceList;
    private String telephone;
    private String title;

    public DG11File(InputStream inputStream) throws IOException {
        super(107, inputStream);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        DG11File dG11File = (DG11File) obj2;
        return Objects.equals(this.custodyInformation, dG11File.custodyInformation) && Objects.equals(this.fullDateOfBirth, dG11File.fullDateOfBirth) && Objects.equals(this.nameOfHolder, dG11File.nameOfHolder) && Objects.equals(this.otherNames, dG11File.otherNames) && Objects.equals(this.otherValidTDNumbers, dG11File.otherValidTDNumbers) && Objects.equals(this.permanentAddress, dG11File.permanentAddress) && Objects.equals(this.personalNumber, dG11File.personalNumber) && Objects.equals(this.personalSummary, dG11File.personalSummary) && Objects.equals(this.placeOfBirth, dG11File.placeOfBirth) && Objects.equals(this.profession, dG11File.profession) && Arrays.equals(this.proofOfCitizenship, dG11File.proofOfCitizenship) && Objects.equals(getTagPresenceList(), dG11File.getTagPresenceList()) && Objects.equals(this.telephone, dG11File.telephone) && Objects.equals(this.title, dG11File.title);
    }

    public String getCustodyInformation() {
        return this.custodyInformation;
    }

    public String getFullDateOfBirth() {
        return this.fullDateOfBirth;
    }

    public String getNameOfHolder() {
        return this.nameOfHolder;
    }

    public List<String> getOtherNames() {
        if (this.otherNames == null) {
            return null;
        }
        return new ArrayList(this.otherNames);
    }

    public List<String> getOtherValidTDNumbers() {
        return this.otherValidTDNumbers;
    }

    public List<String> getPermanentAddress() {
        return this.permanentAddress;
    }

    public String getPersonalNumber() {
        return this.personalNumber;
    }

    public String getPersonalSummary() {
        return this.personalSummary;
    }

    public List<String> getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public String getProfession() {
        return this.profession;
    }

    public byte[] getProofOfCitizenship() {
        return this.proofOfCitizenship;
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public int getTag() {
        return 107;
    }

    @Override // org.jmrtd.lds.icao.AdditionalDetailDataGroup
    public List<Integer> getTagPresenceList() {
        List<Integer> list = this.tagPresenceList;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(12);
        this.tagPresenceList = arrayList;
        if (this.nameOfHolder != null) {
            arrayList.add(Integer.valueOf(FULL_NAME_TAG));
        }
        if (this.otherNames != null) {
            this.tagPresenceList.add(Integer.valueOf(OTHER_NAME_TAG));
        }
        if (this.personalNumber != null) {
            this.tagPresenceList.add(Integer.valueOf(PERSONAL_NUMBER_TAG));
        }
        if (this.fullDateOfBirth != null) {
            this.tagPresenceList.add(Integer.valueOf(FULL_DATE_OF_BIRTH_TAG));
        }
        if (this.placeOfBirth != null) {
            this.tagPresenceList.add(Integer.valueOf(PLACE_OF_BIRTH_TAG));
        }
        if (this.permanentAddress != null) {
            this.tagPresenceList.add(Integer.valueOf(PERMANENT_ADDRESS_TAG));
        }
        if (this.telephone != null) {
            this.tagPresenceList.add(Integer.valueOf(TELEPHONE_TAG));
        }
        if (this.profession != null) {
            this.tagPresenceList.add(Integer.valueOf(PROFESSION_TAG));
        }
        if (this.title != null) {
            this.tagPresenceList.add(Integer.valueOf(TITLE_TAG));
        }
        if (this.personalSummary != null) {
            this.tagPresenceList.add(Integer.valueOf(PERSONAL_SUMMARY_TAG));
        }
        if (this.proofOfCitizenship != null) {
            this.tagPresenceList.add(Integer.valueOf(PROOF_OF_CITIZENSHIP_TAG));
        }
        if (this.otherValidTDNumbers != null) {
            this.tagPresenceList.add(Integer.valueOf(OTHER_VALID_TD_NUMBERS_TAG));
        }
        if (this.custodyInformation != null) {
            this.tagPresenceList.add(Integer.valueOf(CUSTODY_INFORMATION_TAG));
        }
        return this.tagPresenceList;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Objects.hash(this.custodyInformation, this.fullDateOfBirth, this.nameOfHolder, this.otherNames, this.otherValidTDNumbers, this.permanentAddress, this.personalNumber, this.personalSummary, this.placeOfBirth, this.profession, this.telephone, this.title) + n.b(31, 31, this.proofOfCitizenship);
    }

    @Override // org.jmrtd.lds.icao.AdditionalDetailDataGroup
    public void readField(int i, TLVInputStream tLVInputStream) throws IOException {
        int tag2 = tLVInputStream.readTag();
        if (tag2 != 160 && tag2 != i) {
            throw new IllegalArgumentException("Expected " + Integer.toHexString(i) + ", but found " + Integer.toHexString(tag2));
        }
        tLVInputStream.readLength();
        if (tag2 == 160) {
            this.otherNames = AdditionalDetailDataGroup.readContentSpecificFieldsList(tLVInputStream);
            return;
        }
        if (tag2 == 24363) {
            this.fullDateOfBirth = AdditionalDetailDataGroup.readFullDate(tLVInputStream);
            return;
        }
        if (tag2 == 24386) {
            this.permanentAddress = AdditionalDetailDataGroup.readList(tLVInputStream);
            return;
        }
        switch (tag2) {
            case FULL_NAME_TAG /* 24334 */:
                this.nameOfHolder = AdditionalDetailDataGroup.readString(tLVInputStream);
                return;
            case OTHER_NAME_TAG /* 24335 */:
                this.otherNames = Collections.singletonList(AdditionalDetailDataGroup.readString(tLVInputStream));
                return;
            case PERSONAL_NUMBER_TAG /* 24336 */:
                this.personalNumber = AdditionalDetailDataGroup.readString(tLVInputStream);
                return;
            case PLACE_OF_BIRTH_TAG /* 24337 */:
                this.placeOfBirth = AdditionalDetailDataGroup.readList(tLVInputStream);
                return;
            case TELEPHONE_TAG /* 24338 */:
                this.telephone = AdditionalDetailDataGroup.readString(tLVInputStream);
                return;
            case PROFESSION_TAG /* 24339 */:
                this.profession = AdditionalDetailDataGroup.readString(tLVInputStream);
                return;
            case TITLE_TAG /* 24340 */:
                this.title = AdditionalDetailDataGroup.readString(tLVInputStream);
                return;
            case PERSONAL_SUMMARY_TAG /* 24341 */:
                this.personalSummary = AdditionalDetailDataGroup.readString(tLVInputStream);
                return;
            case PROOF_OF_CITIZENSHIP_TAG /* 24342 */:
                this.proofOfCitizenship = AdditionalDetailDataGroup.readBytes(tLVInputStream);
                return;
            case OTHER_VALID_TD_NUMBERS_TAG /* 24343 */:
                this.otherValidTDNumbers = AdditionalDetailDataGroup.readList(tLVInputStream);
                return;
            case CUSTODY_INFORMATION_TAG /* 24344 */:
                this.custodyInformation = AdditionalDetailDataGroup.readString(tLVInputStream);
                return;
            default:
                throw new IllegalArgumentException(a.n(tag2, new StringBuilder("Unknown field tag in DG11: ")));
        }
    }

    @Override // org.jmrtd.lds.DataGroup, org.jmrtd.lds.AbstractTaggedLDSFile
    public String toString() {
        StringBuilder sb6 = new StringBuilder("DG11File [");
        String str = this.nameOfHolder;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", ");
        List<String> list = this.otherNames;
        String string = "[]";
        sb6.append((list == null || list.isEmpty()) ? "[]" : this.otherNames);
        sb6.append(", ");
        String str2 = this.personalNumber;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(", ");
        String str3 = this.fullDateOfBirth;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(", ");
        List<String> list2 = this.placeOfBirth;
        sb6.append((list2 == null || list2.isEmpty()) ? "[]" : this.placeOfBirth.toString());
        sb6.append(", ");
        List<String> list3 = this.permanentAddress;
        sb6.append((list3 == null || list3.isEmpty()) ? "[]" : this.permanentAddress.toString());
        sb6.append(", ");
        String str4 = this.telephone;
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(", ");
        String str5 = this.profession;
        if (str5 == null) {
            str5 = "";
        }
        sb6.append(str5);
        sb6.append(", ");
        String str6 = this.title;
        if (str6 == null) {
            str6 = "";
        }
        sb6.append(str6);
        sb6.append(", ");
        String str7 = this.personalSummary;
        if (str7 == null) {
            str7 = "";
        }
        sb6.append(str7);
        sb6.append(", ");
        sb6.append(this.proofOfCitizenship == null ? "" : a.v(new StringBuilder("image ("), ")", this.proofOfCitizenship.length));
        sb6.append(", ");
        List<String> list4 = this.otherValidTDNumbers;
        if (list4 != null && !list4.isEmpty()) {
            string = this.otherValidTDNumbers.toString();
        }
        sb6.append(string);
        sb6.append(", ");
        String str8 = this.custodyInformation;
        return v0.a.i(sb6, str8 != null ? str8 : "", "]");
    }

    @Override // org.jmrtd.lds.icao.AdditionalDetailDataGroup
    public void writeField(int i, TLVOutputStream tLVOutputStream) throws IOException {
        if (i == 24363) {
            AdditionalDetailDataGroup.writeString(i, this.fullDateOfBirth, tLVOutputStream);
            return;
        }
        if (i == 24386) {
            AdditionalDetailDataGroup.writeList(i, this.permanentAddress, tLVOutputStream);
            return;
        }
        switch (i) {
            case FULL_NAME_TAG /* 24334 */:
                AdditionalDetailDataGroup.writeString(i, this.nameOfHolder, tLVOutputStream);
                return;
            case OTHER_NAME_TAG /* 24335 */:
                AdditionalDetailDataGroup.writeContentSpecificFieldsList(OTHER_NAME_TAG, this.otherNames, tLVOutputStream);
                return;
            case PERSONAL_NUMBER_TAG /* 24336 */:
                AdditionalDetailDataGroup.writeString(i, this.personalNumber, tLVOutputStream);
                return;
            case PLACE_OF_BIRTH_TAG /* 24337 */:
                AdditionalDetailDataGroup.writeList(i, this.placeOfBirth, tLVOutputStream);
                return;
            case TELEPHONE_TAG /* 24338 */:
                AdditionalDetailDataGroup.writeString(i, this.telephone, tLVOutputStream);
                return;
            case PROFESSION_TAG /* 24339 */:
                AdditionalDetailDataGroup.writeString(i, this.profession, tLVOutputStream);
                return;
            case TITLE_TAG /* 24340 */:
                AdditionalDetailDataGroup.writeString(i, this.title, tLVOutputStream);
                return;
            case PERSONAL_SUMMARY_TAG /* 24341 */:
                AdditionalDetailDataGroup.writeString(i, this.personalSummary, tLVOutputStream);
                return;
            case PROOF_OF_CITIZENSHIP_TAG /* 24342 */:
                tLVOutputStream.writeTag(i);
                tLVOutputStream.writeValue(this.proofOfCitizenship);
                return;
            case OTHER_VALID_TD_NUMBERS_TAG /* 24343 */:
                AdditionalDetailDataGroup.writeList(i, this.otherValidTDNumbers, tLVOutputStream);
                return;
            case CUSTODY_INFORMATION_TAG /* 24344 */:
                AdditionalDetailDataGroup.writeString(i, this.custodyInformation, tLVOutputStream);
                return;
            default:
                throw new IllegalStateException(a.n(i, new StringBuilder("Unknown tag in DG11: ")));
        }
    }

    public DG11File(String str, List<String> list, String str2, Date date, List<String> list2, List<String> list3, String str3, String str4, String str5, String str6, byte[] bArr, List<String> list4, String str7) {
        this(str, list, str2, date == null ? null : new SimpleDateFormat("yyyyMMdd").format(date), list2, list3, str3, str4, str5, str6, bArr, list4, str7);
    }

    public DG11File(String str, List<String> list, String str2, String str3, List<String> list2, List<String> list3, String str4, String str5, String str6, String str7, byte[] bArr, List<String> list4, String str8) {
        super(107);
        this.nameOfHolder = str;
        this.otherNames = list == null ? null : new ArrayList(list);
        this.personalNumber = str2;
        this.fullDateOfBirth = str3;
        if (list2 == null) {
            this.placeOfBirth = null;
        } else if (list2.isEmpty()) {
            this.placeOfBirth = Collections.singletonList("");
        } else {
            this.placeOfBirth = new ArrayList(list2);
        }
        if (list3 == null) {
            this.permanentAddress = null;
        } else if (list3.isEmpty()) {
            this.permanentAddress = Collections.singletonList("");
        } else {
            this.permanentAddress = new ArrayList(list3);
        }
        this.telephone = str4;
        this.profession = str5;
        this.title = str6;
        this.personalSummary = str7;
        this.proofOfCitizenship = bArr;
        if (list4 == null) {
            this.otherValidTDNumbers = null;
        } else if (list4.isEmpty()) {
            this.otherValidTDNumbers = Collections.singletonList("");
        } else {
            this.otherValidTDNumbers = new ArrayList(list4);
        }
        this.custodyInformation = str8;
    }
}
