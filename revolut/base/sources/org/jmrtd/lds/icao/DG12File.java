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
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes14.dex */
public class DG12File extends AdditionalDetailDataGroup {
    public static final int CONTENT_SPECIFIC_CONSTRUCTED_TAG = 160;
    public static final int COUNT_TAG = 2;
    public static final int DATE_AND_TIME_OF_PERSONALIZATION_TAG = 24405;
    public static final int DATE_OF_ISSUE_TAG = 24358;
    public static final int ENDORSEMENTS_AND_OBSERVATIONS_TAG = 24347;
    public static final int IMAGE_OF_FRONT_TAG = 24349;
    public static final int IMAGE_OF_REAR_TAG = 24350;
    public static final int ISSUING_AUTHORITY_TAG = 24345;
    public static final int NAME_OF_OTHER_PERSON_TAG = 24346;
    public static final int PERSONALIZATION_SYSTEM_SERIAL_NUMBER_TAG = 24406;
    private static final String SDF = "yyyyMMdd";
    private static final String SDTF = "yyyyMMddhhmmss";
    public static final int TAX_OR_EXIT_REQUIREMENTS_TAG = 24348;
    private static final long serialVersionUID = -1979367459379125674L;
    private String dateAndTimeOfPersonalization;
    private String dateOfIssue;
    private String endorsementsAndObservations;
    private byte[] imageOfFront;
    private byte[] imageOfRear;
    private String issuingAuthority;
    private List<String> namesOfOtherPersons;
    private String personalizationSystemSerialNumber;
    private List<Integer> tagPresenceList;
    private String taxOrExitRequirements;

    public DG12File(String str, Date date, List<String> list, String str2, String str3, byte[] bArr, byte[] bArr2, Date date2, String str4) {
        this(str, date == null ? null : new SimpleDateFormat("yyyyMMdd").format(date), list, str2, str3, bArr, bArr2, date2 != null ? new SimpleDateFormat("yyyyMMddhhmmss").format(date2) : null, str4);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        DG12File dG12File = (DG12File) obj2;
        return Objects.equals(this.dateAndTimeOfPersonalization, dG12File.dateAndTimeOfPersonalization) && Objects.equals(this.dateOfIssue, dG12File.dateOfIssue) && Objects.equals(this.endorsementsAndObservations, dG12File.endorsementsAndObservations) && Arrays.equals(this.imageOfFront, dG12File.imageOfFront) && Arrays.equals(this.imageOfRear, dG12File.imageOfRear) && Objects.equals(this.issuingAuthority, dG12File.issuingAuthority) && Objects.equals(this.namesOfOtherPersons, dG12File.namesOfOtherPersons) && Objects.equals(this.personalizationSystemSerialNumber, dG12File.personalizationSystemSerialNumber) && Objects.equals(this.taxOrExitRequirements, dG12File.taxOrExitRequirements);
    }

    public String getDateAndTimeOfPersonalization() {
        return this.dateAndTimeOfPersonalization;
    }

    public String getDateOfIssue() {
        return this.dateOfIssue;
    }

    public String getEndorsementsAndObservations() {
        return this.endorsementsAndObservations;
    }

    public byte[] getImageOfFront() {
        return this.imageOfFront;
    }

    public byte[] getImageOfRear() {
        return this.imageOfRear;
    }

    public String getIssuingAuthority() {
        return this.issuingAuthority;
    }

    public List<String> getNamesOfOtherPersons() {
        return this.namesOfOtherPersons;
    }

    public String getPersonalizationSystemSerialNumber() {
        return this.personalizationSystemSerialNumber;
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public int getTag() {
        return LDSFile.EF_DG12_TAG;
    }

    @Override // org.jmrtd.lds.icao.AdditionalDetailDataGroup
    public List<Integer> getTagPresenceList() {
        List<Integer> list = this.tagPresenceList;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(10);
        this.tagPresenceList = arrayList;
        if (this.issuingAuthority != null) {
            arrayList.add(Integer.valueOf(ISSUING_AUTHORITY_TAG));
        }
        if (this.dateOfIssue != null) {
            this.tagPresenceList.add(Integer.valueOf(DATE_OF_ISSUE_TAG));
        }
        if (this.namesOfOtherPersons != null) {
            this.tagPresenceList.add(Integer.valueOf(NAME_OF_OTHER_PERSON_TAG));
        }
        if (this.endorsementsAndObservations != null) {
            this.tagPresenceList.add(Integer.valueOf(ENDORSEMENTS_AND_OBSERVATIONS_TAG));
        }
        if (this.taxOrExitRequirements != null) {
            this.tagPresenceList.add(Integer.valueOf(TAX_OR_EXIT_REQUIREMENTS_TAG));
        }
        if (this.imageOfFront != null) {
            this.tagPresenceList.add(Integer.valueOf(IMAGE_OF_FRONT_TAG));
        }
        if (this.imageOfRear != null) {
            this.tagPresenceList.add(Integer.valueOf(IMAGE_OF_REAR_TAG));
        }
        if (this.dateAndTimeOfPersonalization != null) {
            this.tagPresenceList.add(Integer.valueOf(DATE_AND_TIME_OF_PERSONALIZATION_TAG));
        }
        if (this.personalizationSystemSerialNumber != null) {
            this.tagPresenceList.add(Integer.valueOf(PERSONALIZATION_SYSTEM_SERIAL_NUMBER_TAG));
        }
        return this.tagPresenceList;
    }

    public String getTaxOrExitRequirements() {
        return this.taxOrExitRequirements;
    }

    public int hashCode() {
        return Objects.hash(this.dateAndTimeOfPersonalization, this.dateOfIssue, this.endorsementsAndObservations, this.issuingAuthority, this.namesOfOtherPersons, this.personalizationSystemSerialNumber, this.taxOrExitRequirements) + n.b(n.b(31, 31, this.imageOfFront), 31, this.imageOfRear);
    }

    @Override // org.jmrtd.lds.icao.AdditionalDetailDataGroup
    public void readField(int i, TLVInputStream tLVInputStream) throws IOException {
        int tag2 = tLVInputStream.readTag();
        if (tag2 != 160 && tag2 != i) {
            throw new IllegalArgumentException("Expected " + Integer.toHexString(i) + ", but found " + Integer.toHexString(tag2));
        }
        tLVInputStream.readLength();
        if (tag2 == 160) {
            this.namesOfOtherPersons = AdditionalDetailDataGroup.readContentSpecificFieldsList(tLVInputStream);
            return;
        }
        if (tag2 == 24358) {
            this.dateOfIssue = AdditionalDetailDataGroup.readFullDate(tLVInputStream);
            return;
        }
        if (tag2 == 24405) {
            this.dateAndTimeOfPersonalization = AdditionalDetailDataGroup.readFullDateTime(tLVInputStream);
            return;
        }
        if (tag2 == 24406) {
            this.personalizationSystemSerialNumber = AdditionalDetailDataGroup.readString(tLVInputStream);
            return;
        }
        switch (tag2) {
            case ISSUING_AUTHORITY_TAG /* 24345 */:
                this.issuingAuthority = AdditionalDetailDataGroup.readString(tLVInputStream);
                return;
            case NAME_OF_OTHER_PERSON_TAG /* 24346 */:
                this.namesOfOtherPersons = Collections.singletonList(AdditionalDetailDataGroup.readString(tLVInputStream));
                return;
            case ENDORSEMENTS_AND_OBSERVATIONS_TAG /* 24347 */:
                this.endorsementsAndObservations = AdditionalDetailDataGroup.readString(tLVInputStream);
                return;
            case TAX_OR_EXIT_REQUIREMENTS_TAG /* 24348 */:
                this.taxOrExitRequirements = AdditionalDetailDataGroup.readString(tLVInputStream);
                return;
            case IMAGE_OF_FRONT_TAG /* 24349 */:
                this.imageOfFront = AdditionalDetailDataGroup.readBytes(tLVInputStream);
                return;
            case IMAGE_OF_REAR_TAG /* 24350 */:
                this.imageOfRear = AdditionalDetailDataGroup.readBytes(tLVInputStream);
                return;
            default:
                throw new IllegalArgumentException(a.n(tag2, new StringBuilder("Unknown field tag in DG12: ")));
        }
    }

    @Override // org.jmrtd.lds.DataGroup, org.jmrtd.lds.AbstractTaggedLDSFile
    public String toString() {
        StringBuilder sb6 = new StringBuilder("DG12File [");
        String str = this.issuingAuthority;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", ");
        String str2 = this.dateOfIssue;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(", ");
        List<String> list = this.namesOfOtherPersons;
        sb6.append((list == null || list.isEmpty()) ? "[]" : this.namesOfOtherPersons);
        sb6.append(", ");
        String str3 = this.endorsementsAndObservations;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(", ");
        String str4 = this.taxOrExitRequirements;
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(", ");
        sb6.append(this.imageOfFront == null ? "" : a.v(new StringBuilder("image ("), ")", this.imageOfFront.length));
        sb6.append(", ");
        sb6.append(this.imageOfRear == null ? "" : a.v(new StringBuilder("image ("), ")", this.imageOfRear.length));
        sb6.append(", ");
        String str5 = this.dateAndTimeOfPersonalization;
        if (str5 == null) {
            str5 = "";
        }
        sb6.append(str5);
        sb6.append(", ");
        String str6 = this.personalizationSystemSerialNumber;
        return v0.a.i(sb6, str6 != null ? str6 : "", "]");
    }

    @Override // org.jmrtd.lds.icao.AdditionalDetailDataGroup
    public void writeField(int i, TLVOutputStream tLVOutputStream) throws IOException {
        if (i == 24358) {
            AdditionalDetailDataGroup.writeString(i, this.dateOfIssue, tLVOutputStream);
            return;
        }
        if (i == 24405) {
            AdditionalDetailDataGroup.writeString(i, this.dateAndTimeOfPersonalization, tLVOutputStream);
            return;
        }
        if (i == 24406) {
            AdditionalDetailDataGroup.writeString(i, this.personalizationSystemSerialNumber, tLVOutputStream);
            return;
        }
        switch (i) {
            case ISSUING_AUTHORITY_TAG /* 24345 */:
                AdditionalDetailDataGroup.writeString(i, this.issuingAuthority, tLVOutputStream);
                return;
            case NAME_OF_OTHER_PERSON_TAG /* 24346 */:
                AdditionalDetailDataGroup.writeContentSpecificFieldsList(i, this.namesOfOtherPersons, tLVOutputStream);
                return;
            case ENDORSEMENTS_AND_OBSERVATIONS_TAG /* 24347 */:
                AdditionalDetailDataGroup.writeString(i, this.endorsementsAndObservations, tLVOutputStream);
                return;
            case TAX_OR_EXIT_REQUIREMENTS_TAG /* 24348 */:
                AdditionalDetailDataGroup.writeString(i, this.taxOrExitRequirements, tLVOutputStream);
                return;
            case IMAGE_OF_FRONT_TAG /* 24349 */:
                AdditionalDetailDataGroup.writeBytes(i, this.imageOfFront, tLVOutputStream);
                return;
            case IMAGE_OF_REAR_TAG /* 24350 */:
                AdditionalDetailDataGroup.writeBytes(i, this.imageOfRear, tLVOutputStream);
                return;
            default:
                throw new IllegalArgumentException(a.n(i, new StringBuilder("Unknown field tag in DG12: ")));
        }
    }

    public DG12File(String str, String str2, List<String> list, String str3, String str4, byte[] bArr, byte[] bArr2, String str5, String str6) {
        super(LDSFile.EF_DG12_TAG);
        this.issuingAuthority = str;
        this.dateOfIssue = str2;
        this.namesOfOtherPersons = list == null ? null : new ArrayList(list);
        this.endorsementsAndObservations = str3;
        this.taxOrExitRequirements = str4;
        this.imageOfFront = bArr;
        this.imageOfRear = bArr2;
        this.dateAndTimeOfPersonalization = str5;
        this.personalizationSystemSerialNumber = str6;
    }

    public DG12File(InputStream inputStream) throws IOException {
        super(LDSFile.EF_DG12_TAG, inputStream);
    }
}
